package ListaSimpleObjetos;


public class Nodo {
    private Object dato;
    private Nodo siguiente;


    //Contructor para agregar al inicio
    public Nodo(Object dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    //Constructor para agregar al fin
    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente=null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
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
