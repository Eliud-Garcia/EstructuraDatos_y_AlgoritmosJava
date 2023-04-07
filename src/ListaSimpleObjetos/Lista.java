package ListaSimpleObjetos;


public class Lista {
    private Nodo inicio;
    private Nodo fin;
    private int cantidadElementos;

    public Lista() {
        this.inicio = null;
        this.fin = null;
        this.cantidadElementos = 0;
    }
    public boolean vacia() {
        return (inicio == null && fin == null);
    }
    public void agregarInicio(Object nuevo) {
        if (vacia()) {
            fin = inicio = new Nodo(nuevo);
        } else {
            inicio = new Nodo(nuevo, inicio);
        }
        cantidadElementos++;
    }

    public void agregarFin(Object nuevo) {
        if (vacia()) {
            agregarInicio(nuevo);

        } else {
            fin.setSiguiente(new Nodo(nuevo));
            fin = fin.getSiguiente();
            cantidadElementos++;
        }
    }
//
//    public boolean buscar(long cedula) {
//        if (!vacia()) {
//            Nodo aux = inicio;
//            while (aux != null) {
//                if (aux.getDato().getCedula() == cedula) {
//                    return true;
//                }
//                aux = aux.getSiguiente();
//            }
//        }
//        return false;
//
//
//    }

    public String mostrar() {
        String salida = "";
        Nodo aux = inicio;
        while (aux != null) {
            //agregar a que instancia pertenece
            salida += aux.getDato()+ ", ";
            aux = aux.getSiguiente();
        }
        return salida;

    }




//    public void eliminar(long cedula) {
//        if (!vacia()) {
//            if (inicio == fin && cedula == inicio.getDato().getCedula()) {
//                inicio = fin = null;
//            } else if (cedula == inicio.getDato().getCedula()) {
//                inicio = inicio.getSiguiente();
//            } else {
//                Nodo.Nodo anterior = inicio;
//                Nodo temporal = inicio.getSiguiente();
//                while (temporal != null && temporal.getDato().getCedula() != cedula) {
//                    anterior = anterior.getSiguiente();
//                    temporal = temporal.getSiguiente();
//                }
//                if (temporal != null) {
//
//                    anterior.setSiguiente(temporal.getSiguiente());
//                    if (temporal == fin) {
//                        fin = anterior;
//                    }
//                }
//            }
//        }
//    }
}
