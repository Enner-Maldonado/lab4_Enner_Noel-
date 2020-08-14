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
public class Hurto extends Delito_Menor{
    //Atributos
    private String objeto;
    private double valor;
    
    //Constructores

    public Hurto() {
        super();
    }

    public Hurto(String objeto, double valor, String descripcion, String nombre, String culpable, String sentencia, String fecha, String pais, int num_delitos, String name_oficial, String ID, int num_celda) {
        super(descripcion, nombre, culpable, sentencia, fecha, pais, num_delitos, name_oficial, ID, num_celda);
        this.objeto = objeto;
        this.valor = valor;
    }
    
    //Mutadores

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Hurto{" + "objeto=" + objeto + ", valor=" + valor + '}';
    }
    
}
