package ListasClientes;

public class NodoO {
    private Cliente dato;
    private NodoO siguiente;


    //Contructor para agregar al inicio
    public NodoO(Cliente dato, NodoO siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    //Constructor para agregar al fin
    public NodoO(Cliente dato) {
        this.dato = dato;
        this.siguiente=null;
    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public NodoO getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoO siguiente) {
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
