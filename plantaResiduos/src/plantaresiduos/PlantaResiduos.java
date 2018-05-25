/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAW121
 */
public class PlantaResiduos {

    //private ArrayList<Almacen> almacenes;
    
    Scanner Entrada=new Scanner(System.in);
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
    
    public static void main(String[] args) throws IOException {
        Scanner Entrada=new Scanner(System.in);
        PlantaResiduos p=new PlantaResiduos();
        Almacen a=new Almacen(1, 100, "Almacen 1", "Torrelavega");
        
        boolean salir=false;
        int elec=0;
        System.out.println("========   PLANTA DE RESIDUOS   ========");
        
        do{
            System.out.println("***** MENÚ *****");
            System.out.println("1. Introducir residuo.");
            System.out.println("2. Reparar residuo.");
            System.out.println("3. Salir.");
            System.out.println("Seleccione una opción.");
            elec=Entrada.nextInt();
            
            switch(elec){
                case 1:
                    a.anadirResiduo();
                    break;
                case 2:
                    
                    break;
                case 3:
                    salir=true;
                    break;
            }
        }
        while(salir);
    }
    
}
