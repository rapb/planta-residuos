/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

/**
 * 
 * @author Paula Estrada
 * 
 * Esta excepción se produce cuando el estado introducido para el residuo no es válido.
 */
public class EstadoDeResiduoException extends Exception{

    public EstadoDeResiduoException() {
        super("Ese estado no és válido. Por favor elija entre F para Finales, I para Indetermiando y R para Reparables.");
    }
    
    
}
