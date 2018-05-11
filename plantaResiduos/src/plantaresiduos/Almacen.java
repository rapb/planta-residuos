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
public class Almacen {
     Scanner Entrada=new Scanner(System.in);
    
    private int id, capacidad;
    private String nombre, ubicacion;
    private LinkedHashSet<Residuo> residuos;

    public Almacen(int id, int capacidad, String nombre, String ubicacion) {
        this.id = id;
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
         residuos=new LinkedHashSet<>();
    }

    public void anadirResiduo() throws IOException{
        System.out.println("Introduzca el id del residuo:");
        int id=Entrada.nextInt();
        System.out.println("Introduzca el estado del residuo:");
        char estado=(char)System.in.read();
        System.out.println("Introduzca la descripción del residuo:");
        String desc=Entrada.nextLine();
        Residuo r=new Residuo(id, estado, desc);
        
        residuos.add(r);
    }

    public void listarResiduos(){
        for (Residuo residuo : residuos) {
            System.out.println(residuo.toString());
        }
    }
    
    
}
