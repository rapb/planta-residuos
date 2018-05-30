/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 *  @author Raquel Pérez, Sergio Arrey y Paula Estrada. Desarrollo de aplicaciones Web 1.
 */
public class Almacen {

    static LinkedHashSet<Residuo> getResiduos;
     Scanner Entrada=new Scanner(System.in); 
    
    private int id, capacidad;
    private String nombre, ubicacion;
    public LinkedHashSet<Residuo> residuos;
    
    /**
     * Constructor de almacen.
     * @param id - identificador del almancen.
     * @param capacidad - capacidad máxima del mismo.
     * @param nombre - nombre del almacen.
     * @param ubicacion - ubicación del almacen.
     */
    public Almacen(int id, int capacidad, String nombre, String ubicacion) {
        this.id = id;
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        residuos=new LinkedHashSet<>();
        for (Residuo residuo : residuos) {
            
        }
    }
    /**
     * Método para añadir residuos al almacen.
     * @param id - id para el objeto residuo.
     * @param estado - estado del mismo. 'F' para residuos finales, 'R' para recuperables e 'I' para indeterminados.
     * @param desc - descripción del mismo.
     */
    public void anadirResiduo(int id, char estado, String desc){
       
        Residuo r=new Residuo(id, estado, desc);
        //Tras instanciar el residuo, lo añadimos a la lista de residuos que hay en el almacen.
        residuos.add(r);
    }
    /**
     * Método para obtener una lista de todos los residuos, mediante el método toString desarrollado en la clase residuo.
     */
    public void listarResiduos(){
        for (Residuo residuo : residuos) {
            System.out.println(residuo.toString());
        }
    }
    
    //AQUÍ ABAJO GETTERS Y SETTERS
    public Scanner getEntrada() {
        return Entrada;
    }

    public void setEntrada(Scanner Entrada) {
        this.Entrada = Entrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LinkedHashSet<Residuo> getResiduos() {
        return residuos;
    }

    public void setResiduos(LinkedHashSet<Residuo> residuos) {
        this.residuos = residuos;
    }
    
    
}
