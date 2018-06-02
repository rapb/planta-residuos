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
    public Residuo(int id, char estado, String descripcion) throws EstadoDeResiduoException, Exception {
        if (id<=0){
            throw new Exception("El id ha de ser mayor de 0.");
        }
        else{
            this.id=id;
        }
        if (estado=='F' || estado=='f'){
            this.estado=estado;
                        }
        else if(estado=='R' || estado=='r'){
            this.estado=estado;
                        }
        else if(estado=='I' || estado=='i'){
            this.estado=estado;
                        }
        else {throw new EstadoDeResiduoException();}
        if (descripcion.length()<250){
            throw new Exception("Descripción demasiado larga. Debe tener menos de 250 caracteres. ");
        }
        else{
        this.descripcion = descripcion;
        }
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
