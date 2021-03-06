package plantaresiduos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raquel Pérez, Sergio Arrey y Paula Estrada. Desarrollo de
 * aplicaciones Web 1.
 *
 * Trabajo de la tercera evaluación. Desarrollo de aplicación sobre los
 * proyectos trabajados en la segunda.
 */
public class PlantaResiduos {

    //private ArrayList<Almacen> almacenes;
    Scanner Entrada = new Scanner(System.in);
    static String matricula, modelo, resp, nif;
    static int numeroAñosOperativo, estado, id, mes, anio,cant;
    static boolean disponible;

    public PlantaResiduos() {
        //almacenes=new ArrayList<>();
    }

//    public Almacen crearAlmacen(){
//        System.out.println("Introduzca el id del almacen:");
//        int id=Entrada.nextInt();
//        System.out.println("Introduzca la capacidad del almacen:");
//        int capa=Entrada.nextInt();
//        System.out.println("Introduzca el nombre del almacen:");
//        Entrada.next();
//        String nombre=Entrada.nextLine();
//        System.out.println("Introduzca la descripcion del almacen:");
//        String desc=Entrada.nextLine();
//        Almacen a=new Almacen(id, capa, nombre, desc);
//        almacenes.add(a);
//        return a;
//    }
    public static void main(String[] args) throws IOException, EstadoDeResiduoException, Exception {
        Scanner Entrada = new Scanner(System.in);
        PlantaResiduos p = new PlantaResiduos();
        Almacen a = new Almacen(1, 100, "Almacen 1", "Torrelavega");
        TOficina ofi = new TOficina("12345678A","Ana","Fernández","677777777","Calle de los Álamos","Gerstión");
        Taller t1=new Taller("Taller 1");
        Taller t2=new Taller("Taller 2");

        boolean salir = false;
        int elec = 0;
        System.out.println("========   PLANTA DE RESIDUOS   ========");

        do {
            System.out.println("***** MENÚ *****");
            System.out.println("1. Introducir residuo.");
            System.out.println("2. Reparar residuo.");
            System.out.println("3. Listar residuos.");
            System.out.println("4. Añadir trabajador.");
            System.out.println("5. Añadir vehiculo.");
            System.out.println("6. Asignar vehiculo a camionero.");
            System.out.println("7. Asignar camionero a vehiculo.");
            System.out.println("8. Generar nómina.");
            System.out.println("9. Salir.");
            System.out.println("Seleccione una opción.");

            elec = Entrada.nextInt();

            switch (elec) {
                case 1:
                    boolean est = false;
                    System.out.println("Introduzca el id del residuo:");
                    int id = Entrada.nextInt();
                    char estado;
                    do {
                        System.out.println("Introduzca el estado del residuo (F / I / R):");
                        estado = (char) Entrada.next().charAt(0);
                        System.out.println(estado);
                        if (estado == 'F' || estado == 'f') {
                            est = true;
                        } else if (estado == 'R' || estado == 'r') {
                            est = true;
                        } else if (estado == 'I' || estado == 'i') {
                            est = true;
                        } else {
                            throw new EstadoDeResiduoException();
                        }
                    } while (est != true);
                    System.out.println("Introduzca la descripción del residuo:");
                    Entrada.next();
                    String desc = Entrada.nextLine();
                    a.anadirResiduo(id, estado, desc);
                    break;
                case 2:
                    System.out.println("¿En que taller va a reparar el residuo?");
                    System.out.println("¿T1 / T2?");
                    String tallerRep=Entrada.next();
                    if(tallerRep.equalsIgnoreCase("t1")){
                        System.out.println("Introduzca el id del residuo");
                        int resid=Entrada.nextInt();
                        t1.reparar(resid);
                    }
                    else if(tallerRep.equalsIgnoreCase("t2")){
                        System.out.println("Introduzca el id del residuo");
                        int resid=Entrada.nextInt();
                        t2.reparar(resid);
                    }
                    else System.out.println("Esa opción no es correcta.");
                    break;
                case 3:
                    a.listarResiduos();
                    break;
                case 4:
                    System.out.println("Introduzca el nif:");
                    String n=Entrada.next();
                    System.out.println("Introduzca el nombre:");
                    String no=Entrada.next();
                    System.out.println("Introduzca los apellidos:");
                    String ape=Entrada.nextLine();
                    System.out.println("Introduzca el teléfono:");
                    String tel=Entrada.next();
                    System.out.println("Introduzca la dirección:");
                    String dir=Entrada.nextLine();
                    System.out.println("¿A que departamento pertenece el trabajador?");
                    System.out.println("1. Obrero");
                    System.out.println("2. Camionero");
                    System.out.println("3. Oficinista");
                    int depart=Entrada.nextInt();
                    switch(depart){
                        case 1:
                            System.out.println("¿El obrero es supervisor?");
                            resp = Entrada.next();
                            boolean superv;
                            if (resp.equalsIgnoreCase("si")) {
                                superv = true;
                            } else {
                                superv = false;
                            }
                            a.anhadirTrabajadorObrero(n, no, ape, tel, dir, superv);
                            break;
                        case 2:
                            System.out.println("¿El camionero es senior?");
                            resp = Entrada.next();
                            boolean senior;
                            if (resp.equalsIgnoreCase("si")) {
                                senior = true;
                            } else {
                                senior = false;
                            }
                            a.anhadirTrabajadorCamionero(senior, n, no, ape, tel, dir);
                            break;
                        case 3:
                            System.out.println("¿A qué departamento pertenece el oficinista?");
                            String departamento=Entrada.nextLine();
                            a.anhadirTrabajadorOficina(n, no, ape, tel, dir, departamento);
                            break;
                        default:
                            System.out.println("Es posible que esa opción no sea correcta.");
                    }
                    
                    break;
                case 5:
                    System.out.println("Dime la matrícula del vehículo:");
                    matricula = Entrada.next();
                    System.out.println("Dime el modelo del vehículo:");
                    modelo = Entrada.next();
                    System.out.println("Dime los años que lleva operativo:");
                    numeroAñosOperativo = Entrada.nextInt();
                    System.out.println("¿El vehículo está disponible? [si/no]");
                    resp = Entrada.next();
                    if (resp.equalsIgnoreCase("si")) {
                        disponible = true;
                    } else {
                        disponible = false;
                    }
                    a.anhadirVehiculo(matricula, modelo, elec, numeroAñosOperativo, disponible);

                    break;
                case 6:
                    System.out.println("Dime la matricula del vehículo:");
                    matricula = Entrada.next();
                    System.out.println("Dime el nif del camionero:");
                    nif = Entrada.next();
                    a.asignaVehiculoConductor(nif, matricula);
                    break;
                case 7:
                    System.out.println("Dime la matricula del vehículo:");
                    matricula = Entrada.next();
                    System.out.println("Dime el nif del camionero:");
                    nif = Entrada.next();
                    a.asignarConductorVehiculo(nif, matricula);

                    break;
                    
                case 8:
                    System.out.println("Introduzca el identificador de la nómina:");
                    id=Entrada.nextInt();
                    System.out.println("Introduzca el mes de la nómina:");
                    mes=Entrada.nextInt();
                    System.out.println("Introduzca el año de la nómina:");
                    anio=Entrada.nextInt();
                    System.out.println("Introduzca la cantidad de la nómina:");
                    cant=Entrada.nextInt();
                    ofi.generarNomina(id, mes, anio, cant);
                    
                    break;

                case 9:
                    salir = true;
                    break;
            }
        } while (salir != true);
    }

}
