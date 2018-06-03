/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.util.*;

/**
 *
 * @author Raquel Pérez, Sergio Arrey y Paula Estrada. Desarrollo de aplicaciones Web 1.
 */
public class Trabajador implements Llegada{
    
    Scanner Entrada=new Scanner(System.in);
    private String nif, nombre, apellidos,telefono, direccion;
    
    /**
     * Constructor.
     * @param nif - del trabajador.
     * @param nombre - del trabajador.
     * @param apellidos - del trabajador.
     * @param telefono - del trabajador.
     * @param direccion  - del trabajador.
     */
    public Trabajador(String nif, String nombre, String apellidos, String telefono, String direccion) throws Exception {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        
        if(nif.length()!=9){            
            throw new Exception ("El NIF debe tener 9 caracteres.");                 
        } else this.nif = nif;
        
        if (nombre.length()>20){
            throw new Exception("El nombre no puede tener mas de 20 caracteres.");
        } else this.nombre = nombre;
        
        if (apellidos.length()>35){
            throw new Exception("Los apellidos no pueden tener más de 30 caracteres.");
        } else this.apellidos=apellidos;
        
        if (telefono.length()>9 || telefono.length()<0){
            throw new Exception("El teléfono debe tener 9 dígitos");
        } else this.telefono = telefono;
    }  
    
    // N. D. PAULA: HAY QUE TRABAJAR EN ESTO. NO SÉ SI ES NECESARIO.
    public void registrarLlegada(int id, Date fecha){
        
    }
       public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nif);
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
        final Trabajador other = (Trabajador) obj;
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        return true;
    }
}
