/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_enner_noel;

/**
 *
 * @author ENNER
 */
public class Delito_Menor {
    //Atributos
    private String descripcion;
    private String nombre;
    private String culpable;
    private String sentencia;
    private String fecha;
    private String pais;
    private int num_delitos;
    private String name_oficial;
    private String ID;
    private int num_celda;
    
    //Constructores

    public Delito_Menor() {
    }

    public Delito_Menor(String descripcion, String nombre, String culpable, String sentencia, String fecha, String pais, int num_delitos, String name_oficial, String ID, int num_celda) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.culpable = culpable;
        this.sentencia = sentencia;
        this.fecha = fecha;
        this.pais = pais;
        this.num_delitos = num_delitos;
        this.name_oficial = name_oficial;
        this.ID = ID;
        this.num_celda = num_celda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCulpable() {
        return culpable;
    }

    public void setCulpable(String culpable) {
        this.culpable = culpable;
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNum_delitos() {
        return num_delitos;
    }

    public void setNum_delitos(int num_delitos) {
        this.num_delitos = num_delitos;
    }

    public String getName_oficial() {
        return name_oficial;
    }

    public void setName_oficial(String name_oficial) {
        this.name_oficial = name_oficial;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getNum_celda() {
        return num_celda;
    }

    public void setNum_celda(int num_celda) {
        this.num_celda = num_celda;
    }

    @Override
    public String toString() {
        return "Delito_Menor{" + "descripcion=" + descripcion + ", nombre=" + nombre + ", culpable=" + culpable + ", sentencia=" + sentencia + ", fecha=" + fecha + ", pais=" + pais + ", num_delitos=" + num_delitos + ", name_oficial=" + name_oficial + ", ID=" + ID + ", num_celda=" + num_celda + '}';
    }
    
    
}
