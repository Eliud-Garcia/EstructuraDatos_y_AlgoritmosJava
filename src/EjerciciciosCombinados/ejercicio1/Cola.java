package EjerciciciosCombinados.ejercicio1;

public class Cola {

    private Nodo inicio;
    private Nodo fin;
    private int cantidad; // hace referencia a la cantidad de elemento

    public Cola() {
        this.inicio = null;
        this.fin = null;
        this.cantidad = 0;
    }

    public boolean vacia() {
        return inicio == null && fin == null;
    }

    //para agregar en la cola o de ultimo
    public void encolar(Object dato) {
        if (vacia()) {
            inicio = fin = new Nodo(dato, null);
        } else {
            Nodo nuevo = new Nodo(dato, null);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        cantidad++;
    }

    public void desencolar() {
        if (!vacia()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                inicio = inicio.getSiguiente();
            }
            cantidad--;
        }
    }

    public void eliminar(Object dato) {
        if (!vacia()) {
            Cola aux = new Cola();

            while (!vacia()) {
                if (!inicio.getDato().equals(dato)) {
                    aux.encolar(inicio.getDato());
                }
                desencolar();
            }
            inicio = aux.getInicio();
            fin = aux.getFin();
            cantidad = aux.getCantidad();
        }
    }



    public String mostrar() {
        String salida = "";
        if (!vacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                salida += aux.getDato() + " \n";
                aux = aux.getSiguiente();
            }
        }
        return salida;
    }

    //Getter and Setter
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cola{" + "inicio=" + inicio + ", fin=" + fin + ", cantidad=" + cantidad + '}';
    }
}
