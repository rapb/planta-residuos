/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plantaresiduos;

import java.util.HashSet;
import java.util.Objects;

/**
 * 
 * @author Raquel Pérez, Sergio Arrey y Paula Estrada. Desarrollo de aplicaciones Web 1.
 */
public class Vehiculo {
    private String matricula,modelo;
    private int numeroAñosOperativo,estado;
    private boolean disponible;
    private  HashSet<TCamionero>conductores ;
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
    public Vehiculo(String matricula, String modelo, int numeroAñosOperativo, int estado, boolean disponible)throws Exception {
        char dig;
        boolean es=true;
        if(matricula.length()==7){
                String letras=matricula.substring(4, 6);
                for(int i=0;i<letras.length();i++){
                   dig= letras.charAt(i);
                   if(Character.isLetter(dig)!=true){
                       es=false;
                   }
                }
                String numero=matricula.substring(0, 3);
                  for(int i=0;i<numero.length();i++){
                   dig= numero.charAt(i);
                   if(Character.isLetter(dig)!=true){
                       es=false;
                   }
                  }
                if(es==true){
                 this.matricula = matricula;
                }
        }else{
              throw new Exception("la matricula no tiene 7 caracteres");
        }
        this.modelo = modelo;
        if(numeroAñosOperativo<20 || numeroAñosOperativo>0){
        this.numeroAñosOperativo = numeroAñosOperativo;
        } else{
                 throw new Exception("el numero de años operativo no es logico");
                }
        this.estado = estado;
        this.disponible = disponible;
        this.conductores=new HashSet<TCamionero>();
    }
    
    // N. D. PAULA: HAY QUE REPASAR TODO ESTO DE ABAJO, QUE NO SÉ QUE ESTABA HACIENDO SERGIO JAJAJA
    public void conducir(){
    //    if()
        disponible=true;
    }
   //public boolean anhadirConcuctor(TCamoinero conductor){
        
  //  }
   public void anhadirConductor(TCamionero cam){
       
       conductores.add(cam);
   }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
