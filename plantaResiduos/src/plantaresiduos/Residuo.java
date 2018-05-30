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
public class Residuo {
    
    int id;
    //F - Finales (están reparados)  |  R - Recuperables (se pueden reparar)  |  I - Indeterminado (No está claro que se pueda reparar)
    char estado;
    String descripcion;

    public Residuo() {
    }
    /**
     * Constructor.
     * @param id - id del residuo.
     * @param estado - estado de éste. F - Finales (están reparados)  |  R - Recuperables (se pueden reparar)  |  I - Indeterminado (No está claro que se pueda reparar)
     * @param descripcion - descripción del mismo.
     */
    public Residuo(int id, char estado, String descripcion) {
        this.id = id;
        this.estado = estado;
        this.descripcion = descripcion;
    }
    
    //GETTERS, SETTERS y TOSTRING
    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }
    
    /**
     * 
     * @return devuelve un String listo para se impreso por el método de listar en almacen.
     */
    @Override
    public String toString() {
        return "Residuo: " + id 
                + " Estado: " + estado 
                + " Descripcion: " + descripcion;
    }
    
    
}
