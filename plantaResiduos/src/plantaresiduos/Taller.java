/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.util.LinkedHashSet;

/**
 *
 * @author Raquel Pérez, Sergio Arrey y Paula Estrada. Desarrollo de aplicaciones Web 1.
 */
public class Taller {
    
    private String nombre;
    private int maxResido[]=new int [100];
    private LinkedHashSet<Reparacion> reparacion;
    
    /**
     * Constructor
     * @param nombre - del taller. 
     * NOTA DE PAULA : Según el manual se identifican los talleres mediante un nombre. ¿No sería más últil un identificador no alfanumérico, sólo numérico?
     * Se inicializa una lista de reparaciones con él.
     */
    public Taller(String nombre) {
        this.nombre = nombre;
        this.reparacion = new LinkedHashSet<>();
    }
    
    /**
     * Método para realizar reparaciones en los residuos. Se obtiene la lista de residuos se busca el que corresponda con el id pasado y se le asigna el estado F(Final)
     * @param id - id del residuo a reparar.
     */
    public void reparar(int id){
        LinkedHashSet<Residuo> r;
        r=Almacen.getResiduos;
        for (Residuo residuo : r) {
            if(id==residuo.getId()){
                residuo.setEstado('F');
            }
        }
    }
    
}
