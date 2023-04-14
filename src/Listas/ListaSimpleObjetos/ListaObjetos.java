package Listas.ListaSimpleObjetos;

public class ListaObjetos {
    private Nodo inicio;
    private Nodo fin;
    private int cantidadElementos;

    public ListaObjetos() {
        this.inicio = null;
        this.fin = null;
        this.cantidadElementos = 0;
    }

    public void agregarInicio(Contratador nuevo) {
        if (!buscar(nuevo.getCedula())) {
            if (vacia()) {
                fin = inicio = new Nodo(nuevo);
            } else {
                inicio = new Nodo(nuevo, inicio);
            }
            cantidadElementos++;
        }
    }

    public void agregarFin(Contratador nuevo) {
        if (!buscar(nuevo.getCedula())) {
            if (vacia()) {
                agregarInicio(nuevo);

            } else {
                fin.setSiguiente(new Nodo(nuevo));
                fin = fin.getSiguiente();
                cantidadElementos++;
            }
        }

    }

    public boolean buscar(long cedula) {
        if (!vacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                if (aux.getDato().getCedula() == cedula) {
                    return true;
                }
                aux = aux.getSiguiente();
            }
        }
        return false;


    }

    public String mostrar() {
        String salida = "";
        Nodo aux = inicio;
        while (aux != null) {
            salida += aux.getDato().getNombre() + ", ";
            aux = aux.getSiguiente();
        }
        return salida;

    }

    //para saber si está vacia
    public boolean vacia() {
        return (inicio == null && fin == null);
    }

    public void eliminar(long cedula) {
        if (!vacia()) {
            if (inicio == fin && cedula == inicio.getDato().getCedula()) {
                inicio = fin = null;
            } else if (cedula == inicio.getDato().getCedula()) {
                inicio = inicio.getSiguiente();
            } else {
                Nodo anterior = inicio;
                Nodo temporal = inicio.getSiguiente();
                while (temporal != null && temporal.getDato().getCedula() != cedula) {
                    anterior = anterior.getSiguiente();
                    temporal = temporal.getSiguiente();
                }
                if (temporal != null) {

                    anterior.setSiguiente(temporal.getSiguiente());
                    if (temporal == fin) {
                        fin = anterior;
                    }
                }
            }
        }
    }

}
