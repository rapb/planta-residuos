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
public class TOficiona extends Trabajador{
    
    private String departamento;
    
    public TOficiona(String nif, String nombre, String apellidos, String telefono, String direccion, String departamento) {
        super(nif, nombre, apellidos, telefono, direccion);
        this.departamento=departamento;
    }
    
}
