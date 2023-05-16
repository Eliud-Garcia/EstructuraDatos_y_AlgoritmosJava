package Arboles.arbolBinario;

public class Nodo {
    private Estudiante estudiante;
    private Nodo izq, der;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.izq = null;
        this.der = null;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return estudiante.toString() + "\n";
    }
}
