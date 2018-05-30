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
public class Vehiculo {
    private String matricula,modelo;
    private int numeroAñosOperativo,estado;
    private boolean disponible;
  //  private TCamionero;
   // private  HashSet<TCamoinero>conductores ;
    
    /**
     * Constructor
     * @param matricula - del vehículo
     * @param modelo- del vehículo
     * @param numeroAñosOperativo- del vehículo
     * @param estado- del vehículo
     * @param disponible - true si sí, false si no.
     */
    public Vehiculo(String matricula, String modelo, int numeroAñosOperativo, int estado, boolean disponible) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.numeroAñosOperativo = numeroAñosOperativo;
        this.estado = estado;
        this.disponible = disponible;
    }
    
    // N. D. PAULA: HAY QUE REPASAR TODO ESTO DE ABAJO, QUE NO SÉ QUE ESTABA HACIENDO SERGIO JAJAJA
    public void conducir(){
    //    if()
        disponible=true;
    }
   //public boolean anhadirConcuctor(TCamoinero conductor){
        
  //  }
    public boolean generarVehiculo(){
      return true;
    }
}
