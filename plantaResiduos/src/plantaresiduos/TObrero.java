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
public class TObrero extends Trabajador{
    
    private boolean esSupervisor;

    public TObrero(String nif, String nombre, String apellidos, String telefono, String direccion, boolean esSupervisor) {
        super(nif, nombre, apellidos, telefono, direccion);
        this.esSupervisor=esSupervisor;
    }
    
    public void reparar(){
        System.out.println("Introduzca el id del residuo:");
        int id=Entrada.nextInt();
        //Aquí lo que no se como ponerlo xDD
        for  (Almacen.Residuo residuo : residuos {
            if(id==residuo.getId()){
                residuo.setEstado('R');
            }
        }
    }

            
        }
    
    

