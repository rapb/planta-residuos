/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.util.Date;

/**
 *
 * @author Paula
 */
public interface Llegada {
    
    /**
     * Método que heredarán camioneros y obreros para registrar las llegadas de los residuos.
     * @param id - del registro.
     * @param fecha - fecha del registro.
     */
    static void registrarLlegada(int id, Date fecha){

    }
}
