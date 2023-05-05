package EjerciciciosCombinados.ejercicio1;

public class Lavadora {
    private int codigo;
    private String nombre;
    private String revisor;
    private boolean estado;


    public Lavadora(int codigo, String nombre, String revisor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.revisor = revisor;


    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Lavadora{" + "codigo=" + codigo + ", nombre=" + nombre + ", revisor=" + revisor + '}';
    }
}
