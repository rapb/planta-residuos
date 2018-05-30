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
public class EstadoDeResiduoException extends Exception{

    public EstadoDeResiduoException() {
        super("Ese estado no és válido. Por favor elija entre F para Finales, I para Indetermiando y R para Reparables.");
    }
    
    
}
