/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.util.LinkedHashSet;

/**
 *
 * @author DAW121
 */
public class Taller {
    
    private String nombre;
    private int maxResido[]=new int [100];
    private LinkedHashSet<Reparacion> reparacion;

    public Taller(String nombre, LinkedHashSet<Reparacion> reparacion) {
        this.nombre = nombre;
        this.reparacion = reparacion;
    }
    
    public void reparar(int id){
        LinkedHashSet<Residuo> r;
        r=Almacen.getResiduos;
        for (Residuo residuo : r) {
            if(id==residuo.getId()){
                residuo.setEstado('R');
            }
        }
    }
    
}
