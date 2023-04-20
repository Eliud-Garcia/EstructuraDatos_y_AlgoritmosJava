package EjerciciciosCombinados;

public class Lista {

    private Nodo inicio;
    private Nodo fin;
    private int cantidadElementos;

    public Lista() {
        this.inicio = null;
        this.fin = null;
        this.cantidadElementos = 0;
    }

    public void agregarInicio(Object nuevo) {

        if (vacia()) {
            fin = inicio = new Nodo(nuevo, null);
        } else {
            inicio = new Nodo(nuevo, inicio);
        }
        cantidadElementos++;

    }

    public void agregarFin(Object nuevo) {

        if (vacia()) {
            agregarInicio(nuevo);

        } else {
            fin.setSiguiente(new Nodo(nuevo, null));
            fin = fin.getSiguiente();
            cantidadElementos++;
        }

    }

    public void eliminarInicio() {
        if (!vacia()) {
            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {

                inicio = inicio.getSiguiente();
            }
            cantidadElementos--;
        }

    }

    public void eliminarFin() {
        if (!vacia()) {
            Nodo aux = inicio;
            if (inicio == fin) {
                fin = inicio = null;
            } else {
                while (aux.getSiguiente() != fin) {
                    aux = aux.getSiguiente();
                }
                fin = aux;
                fin.setSiguiente(null);
            }
            cantidadElementos--;
        }
    }

    public Lista entregarPedidos(Pila pila, Cola cola) {
        while (!pila.vacia() && !cola.vacia()) {
            Tienda tienda = (Tienda) (cola.getInicio().getDato());
            if (tienda.getSolicitud() <= pila.getTam()) {
                String lavadoras = "";
                for (int i = 0; i < tienda.getSolicitud(); i++) {
                    if(((Lavadora)(pila.getCima().getDato())).isEstado()){
                        lavadoras += pila.getCima().getDato() + "\n";
                    }else{
                        i--;
                    }

                    pila.desapilar();
                }
                agregarFin(new Pedido(tienda.getNombre(), lavadoras));
                cola.desencolar();
            }else{
                break;
            }
        }

        return this;
    }

    public String mostrar() {
        String salida = "";
        Nodo aux = inicio;
        while (aux != null) {
            salida += aux.getDato() + "\n ";
            aux = aux.getSiguiente();
        }
        return salida;

    }

    //para saber si está vacia
    public boolean vacia() {
        return (inicio == null && fin == null);
    }
}
