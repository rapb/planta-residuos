/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.util.Scanner;

/**
 *
 * @author DAW121
 */
public class Nomina {
    
    Scanner Entrada=new Scanner(System.in); 
    
    private int id;
    private int mes;
    private int anio;
    private double cant;

    public Nomina(int id, int mes, int anio, double cant) {
        this.id = id;
        this.mes = mes;
        this.anio = anio;
        this.cant = cant;
    }
    
    
    
    
}
