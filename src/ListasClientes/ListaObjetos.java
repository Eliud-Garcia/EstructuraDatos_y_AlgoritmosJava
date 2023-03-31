package ListasClientes;

public class ListaObjetos {
    private NodoO inicio;
    private NodoO fin;
    private int cantidadElementos;

    public ListaObjetos() {
        this.inicio = null;
        this.fin = null;
        this.cantidadElementos = 0;
    }
    public void agregarInicio(Cliente nuevo) {
       if(!buscar(nuevo.getCedula())){
           if (vacia()) {
               fin = inicio = new NodoO(nuevo);
           } else {
               inicio = new NodoO(nuevo, inicio);
           }
           cantidadElementos++;
       }
    }

    public void agregarFin(Cliente nuevo) {
        if(!buscar(nuevo.getCedula())){
            if (vacia()) {
                agregarInicio(nuevo);

            } else {
                fin.setSiguiente(new NodoO(nuevo));
                fin = fin.getSiguiente();
                cantidadElementos++;
            }
        }

    }
    public boolean buscar(long cedula) {
        if (!vacia()) {
            NodoO aux = inicio;
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
        NodoO aux = inicio;
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
                NodoO anterior = inicio;
                NodoO temporal = inicio.getSiguiente();
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
