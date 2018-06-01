/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.util.Calendar;

/**
 *
 * @author Raquel Pérez, Sergio Arrey y Paula Estrada. Desarrollo de aplicaciones Web 1.
 */
public class Reparacion {
    
    private int id;
    private Calendar fecha;
    private String desc;
    
    public Reparacion(){}
    
    
    /**
     * 
     * @param id - id de la reparación.
     * @param fecha - fecha de ésta.
     * @param desc - descripción de la misma.
     */
    public Reparacion(int id, Calendar fecha, String desc) {
        this.id = id;
        this.fecha = fecha;
        this.desc = desc;
    }
    
    
    
}
