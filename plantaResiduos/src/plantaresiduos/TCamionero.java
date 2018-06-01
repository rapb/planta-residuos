/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plantaresiduos;

import java.util.HashSet;

/**
 * 
 * @author Raquel Pérez, Sergio Arrey y Paula Estrada. Desarrollo de aplicaciones Web 1.
 */
public class TCamionero extends Trabajador {
    
    private boolean senior;
    private  HashSet<Vehiculo>vehiculos ;
    
    /**
     * Constructor.
     * Esta clase hereda de Trabajador.
     * 
     * @param senior - True si es un conductor senior, false si no.
     * @param nif - nif del trabajador. Heredado de Trabajador.
     * @param nombre - nombre del trabajador. Heredado de Trabajador.
     * @param apellidos - apellidos del trabajador. Heredado de Trabajador.
     * @param telefono - teleono del trabajador. Heredado de Trabajador.
     * @param direccion - dirección del trabajador. Heredado de Trabajador.
     */
    public TCamionero(boolean senior, String nif, String nombre, String apellidos, String telefono, String direccion) {
        super(nif, nombre, apellidos, telefono, direccion);
        this.senior = senior;
    }
   
    

   
    

    public void asignaCamion(Vehiculo camion){
      vehiculos.add(camion);
    }
    
}
    
