/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author DAW111
 */
public class TObrero extends Trabajador{
    
    private boolean esSupervisor;
    private int cont=1;

    public TObrero(String nif, String nombre, String apellidos, String telefono, String direccion, boolean esSupervisor) {
        super(nif, nombre, apellidos, telefono, direccion);
        this.esSupervisor=esSupervisor;
    }
    
    

            
        }
    
    

