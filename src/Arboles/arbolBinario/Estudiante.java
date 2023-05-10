package Arboles.arbolBinario;

public class Estudiante {
    private int codigo;
    private String nombre;
    private double nota;

    public Estudiante(int codigo, String nombre, double nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota = nota;
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + ", nota=" + nota + '}' + "\n";
    }


}
