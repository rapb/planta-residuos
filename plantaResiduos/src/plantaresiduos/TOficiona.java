/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author Raquel Pérez, Sergio Arrey y Paula Estrada. Desarrollo de aplicaciones Web 1.
 */
public class TOficiona extends Trabajador{
    
    private String departamento;
    private LinkedHashSet<Nomina> nominas;
    
    /**
     * Constructor.
     * Esta clase hereda de Trabajador.
     * 
     * @param nif - nif del trabajador. Heredado de Trabajador.
     * @param nombre - nombre del trabajador. Heredado de Trabajador.
     * @param apellidos - apellidos del trabajador. Heredado de Trabajador.
     * @param telefono - teleono del trabajador. Heredado de Trabajador.
     * @param direccion - dirección del trabajador. Heredado de Trabajador.
     * @param departamento - departamento en el que trabaja.
     */
    public TOficiona(String nif, String nombre, String apellidos, String telefono, String direccion, String departamento) {
        super(nif, nombre, apellidos, telefono, direccion);
        this.departamento=departamento;
        nominas=new LinkedHashSet<>();
    }
    
    /**
     * Método para generar nóminas.
     * @param id -  id de la nómina.
     * @param mes - mes de ésta.
     * @param anio - año de ésta.
     * @param cant - cantidad de la misma.
     */
    public void generarNomina(int id, int mes, int anio, int cant) throws Exception{
          //Hay que mover esto hayá donde se vaya a dar la opción de generar nómina.
          
//        Scanner Entrada= new Scanner(System.in); 
//        
//        System.out.println("Introduzca el id de la nómina:");   
//        int id=Entrada.nextInt();
//        
//        System.out.println("Introduzca el mes:");
//        int mes=Entrada.nextInt();
//        
//        System.out.println("Introduzca el año:");
//        int anio=Entrada.nextInt();
//        
//        System.out.println("Introduzca la cantidad");
//        double cant=Entrada.nextDouble();
        
        Nomina n=new Nomina(id, mes, anio, cant);
        //Instancia la nómina, y la añade a la lista de nóminas.
        nominas.add(n);
    } 
    
}
