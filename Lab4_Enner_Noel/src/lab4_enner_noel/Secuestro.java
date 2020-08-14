package lab4_enner_noel;

/**
 *
 * @author noelg
 */
public class Secuestro extends DelitoGrave {
    private String TiempoRetenido;
    private String EstadoPersona;

    public Secuestro() {
    }

    public Secuestro(String TiempoRetenido, String EstadoPersona) {
        this.TiempoRetenido = TiempoRetenido;
        this.EstadoPersona = EstadoPersona;
    }

    public Secuestro(String TiempoRetenido, String EstadoPersona, String Descripcion, String NombreVictima, String Culpable, String Sentencia, String Fecha, String Pais, int NumDelito) {
        super(Descripcion, NombreVictima, Culpable, Sentencia, Fecha, Pais, NumDelito);
        this.TiempoRetenido = TiempoRetenido;
        this.EstadoPersona = EstadoPersona;
    }

    public String getTiempoRetenido() {
        return TiempoRetenido;
    }

    public void setTiempoRetenido(String TiempoRetenido) {
        this.TiempoRetenido = TiempoRetenido;
    }

    public String getEstadoPersona() {
        return EstadoPersona;
    }

    public void setEstadoPersona(String EstadoPersona) {
        this.EstadoPersona = EstadoPersona;
    }

    @Override
    public String toString() {
        return "Secuestro{" + "TiempoRetenido=" + TiempoRetenido + ", EstadoPersona=" + EstadoPersona + '}';
    }
    
}
