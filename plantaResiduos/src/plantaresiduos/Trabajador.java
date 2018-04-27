/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.util.*;

/**
 *
 * @author DAW111
 */
public class Trabajador {
    
    Scanner Entrada=new Scanner(System.in);
    private String nif, nombre, apellidos,telefono, direccion;

    public Trabajador(String nif, String nombre, String apellidos, String telefono, String direccion) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }  
    
    public void registrarLlegada(){
        System.out.println("Identificador de residuo:");
        int id= Entrada.nextInt();
        System.out.println("Fecha de llegada:");

    }
}
