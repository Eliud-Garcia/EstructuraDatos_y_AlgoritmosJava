package Listas.ListaSimpleObjetos;

public class Nodo {
    private Contratador dato;
    private Nodo siguiente;


    //Contructor para agregar al inicio
    public Nodo(Contratador dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    //Constructor para agregar al fin
    public Nodo(Contratador dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Contratador getDato() {
        return dato;
    }

    public void setDato(Contratador dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", siguiente=" + siguiente +
                '}';
    }
}
