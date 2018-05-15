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
    
    public void reparar(){
        System.out.println("Introduzca el id del residuo:");
        int id=Entrada.nextInt();
        //Aquí lo que no se como ponerlo xDD
        for  (Almacen.Residuo residuo : residuos {
            if(id==residuo.getId()){
                residuo.setEstado('R');
                Calendar f=Calendar.getInstance(Locale.ITALY);
                System.out.println("Introduzca la descripción de la reparación:");
                String d=Entrada.nextLine();
                Reparacion r=new Reparacion(cont,f,d);
                //Aquí hay que poner el add para la lista de reparaciones.
                
            }
        }
    }

            
        }
    
    

