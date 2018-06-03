/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;



/**
 *
 * @author Raquel Pérez, Sergio Arrey y Paula Estrada. Desarrollo de aplicaciones Web 1.
 */
public class TObrero extends Trabajador{
    
    private boolean esSupervisor;
    
    /**
     * Constructor.
     * Esta clase hereda de Trabajador.
     * 
     * @param nif - nif del trabajador. Heredado de Trabajador.
     * @param nombre - nombre del trabajador. Heredado de Trabajador.
     * @param apellidos - apellidos del trabajador. Heredado de Trabajador.
     * @param telefono - teleono del trabajador. Heredado de Trabajador.
     * @param direccion - dirección del trabajador. Heredado de Trabajador.
     * @param esSupervisor - true si es supervisor, false si no.
     * @throws java.lang.Exception
     */
    public TObrero(String nif, String nombre, String apellidos, String telefono, String direccion, boolean esSupervisor) throws Exception{
        super(nif, nombre, apellidos, telefono, direccion);
        this.esSupervisor=esSupervisor;
    }
    
    

            
        }
    
    

