/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

/**
 *
 * @author DAW121
 */
public class Residuo {
    
    int id;
    //F - Finales (están reparados)  |  R - Recuperables (se pueden reparar)  |  I - Indeterminado (No está claro que se pueda reparar)
    char estado;
    String descripcion;

    public Residuo() {
    }

    public Residuo(int id, char estado, String descripcion) {
        this.id = id;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }
    
    
}
