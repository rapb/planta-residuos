/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.util.Calendar;

/**
 *
 * @author Paula
 */
public class Reparacion {
    
    private int id;
    private Calendar fecha;
    private String desc;

    public Reparacion(int id, Calendar fecha, String desc) {
        this.id = id;
        this.fecha = fecha;
        this.desc = desc;
    }
    
    
    
}
