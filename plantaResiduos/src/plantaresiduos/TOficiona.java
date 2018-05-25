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
 * @author DAW111
 */
public class TOficiona extends Trabajador{
    
    private String departamento;
    private LinkedHashSet<Nomina> nominas;
    
    public TOficiona(String nif, String nombre, String apellidos, String telefono, String direccion, String departamento) {
        super(nif, nombre, apellidos, telefono, direccion);
        this.departamento=departamento;
        nominas=new LinkedHashSet<>();
    }
    
    public void generarNomina() throws IOException{
        Scanner Entrada= new Scanner(System.in); 
        
        System.out.println("Introduzca el id de la nómina:");   
        int id=Entrada.nextInt();
        
        System.out.println("Introduzca el mes:");
        int mes=Entrada.nextInt();
        
        System.out.println("Introduzca el año:");
        int anio=Entrada.nextInt();
        
        System.out.println("Introduzca la cantidad");
        double cant=Entrada.nextDouble();
        
        Nomina n=new Nomina(id, mes, anio, cant);
        
        nominas.add(n);
    } 
    
}
