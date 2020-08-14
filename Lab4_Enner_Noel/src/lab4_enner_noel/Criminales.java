package lab4_enner_noel;

/**
 *
 * @author noelg
 */
public class Criminales {
    private String nombre;
    private int Edad;
    private String genero;
    private String PaisResidencia;
    private String encarcelado;
    private String DescFisica;

    public Criminales() {
    }

    public Criminales(String nombre, int Edad, String genero, String PaisResidencia, String encarcelado, String DescFisica) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.genero = genero;
        this.PaisResidencia = PaisResidencia;
        this.encarcelado = encarcelado;
        this.DescFisica = DescFisica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPaisResidencia() {
        return PaisResidencia;
    }

    public void setPaisResidencia(String PaisResidencia) {
        this.PaisResidencia = PaisResidencia;
    }

    public String getEncarcelado() {
        return encarcelado;
    }

    public void setEncarcelado(String encarcelado) {
        this.encarcelado = encarcelado;
    }

    public String getDescFisica() {
        return DescFisica;
    }

    public void setDescFisica(String DescFisica) {
        this.DescFisica = DescFisica;
    }

    @Override
    public String toString() {
        return "Criminales{" + "nombre=" + nombre + ", Edad=" + Edad + ", genero=" + genero + ", PaisResidencia=" + PaisResidencia + ", encarcelado=" + encarcelado + ", DescFisica=" + DescFisica + '}';
    }
    
}
