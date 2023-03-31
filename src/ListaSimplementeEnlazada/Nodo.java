package ListaSimplementeEnlazada;

public class Nodo {
    private int dato;
    private Nodo siguiente;


    //Contructor para agregar al inicio
    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    //Constructor para agregar al fin
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente=null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
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
