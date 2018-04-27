/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plantaresiduos;

import java.util.HashSet;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TCamionero extends Trabajador {
    
    private boolean senior;
    private  HashSet<Vehiculo>vehiculos ;

    public TCamionero(boolean senior, String nif, String nombre, String apellidos, String telefono, String direccion) {
        super(nif, nombre, apellidos, telefono, direccion);
        this.senior = senior;
    }
    

    public void asignaCamion(Vehiculo camion){
      
    }
}
