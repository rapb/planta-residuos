/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.util.Scanner;

/**
 *
 *  @author Raquel Pérez, Sergio Arrey y Paula Estrada. Desarrollo de aplicaciones Web 1.
 */
public class Nomina {
    
    Scanner Entrada=new Scanner(System.in); 
    
    private int id;
    private int mes;
    private int anio;
    private double cant;

    /**
     * Constructor de la nómina.
     * @param id - id identificador de la nómina.
     * @param mes - mes de expedición.
     * @param anio - año de expedición.
     * @param cant - cantidad.
     */
    public Nomina(int id, int mes, int anio, double cant) throws Exception {
//        this.id = id;
//        this.mes = mes;
//        this.anio = anio;
//        this.cant = cant;
        if (id<=0){
            throw new Exception ("El ID no puede ser menor que 0.");
        }else{
            this.id=id;
        }
        
        if (mes<1 || mes>12){
            throw new Exception ("El mes debe ser un número comprendido entre 1 y 12.");
        }else{
            this.mes=mes;
        }
        
        if (anio<0){
            throw new Exception ("El año no debe ser menor que 0");
        }else{
            this.anio=anio;
        }
        
        if (cant<0){
            throw new Exception ("La cantidad no puede ser menor que 0.");
        }else{
            this.cant=cant;
        }
    }
    
    
    
    
}
