/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

/**
 *
 * @author DAW111
 */
public class TObrero extends Trabajador implements Reparacion{
    
    private boolean esSupervisor;

    public TObrero(String nif, String nombre, String apellidos, String telefono, String direccion) {
        super(nif, nombre, apellidos, telefono, direccion);
        this.esSupervisor=esSupervisor;
    }
    
    

    @Override
    public void reparar() {
        System.out.println("Introduzca el id del residuo:");
            
        
        }
            
        }
    
    

