package lab4_enner_noel;

/**
 *
 * @author noelg
 */
public class Violacion extends DelitoGrave {
    private int EdadVictima;

    public Violacion() {
    }

    public Violacion(String Descripcion, String NombreVictima, String Culpable, String Sentencia, String Fecha, String Pais, int NumDelito) {
        super(Descripcion, NombreVictima, Culpable, Sentencia, Fecha, Pais, NumDelito);
    }

    public int getEdadVictima() {
        return EdadVictima;
    }

    public void setEdadVictima(int EdadVictima) {
        this.EdadVictima = EdadVictima;
    }

    @Override
    public String toString() {
        return "Violacion{" + "EdadVictima=" + EdadVictima + '}';
    }
    
}
