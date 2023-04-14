package Pilas;

public class Pila {
    private Nodo cima;
    private int tam;

    public Pila() {
        this.cima = null;
        this.tam = 0;
    }
    public boolean vacia() {
        //si la cima esta en null es porque esta vacia
        return cima == null;
    }

    //agregar en la cima
    public void apilar(Object dato) {
        Nodo nuevo = new Nodo(dato, cima);
        cima = nuevo;
        tam++;
    }

    //eliminar cima
    public void desapilar() {
        if (!vacia()) {
            cima = cima.getSiguiente();
            tam--;
        }
    }

    public void eliminar(Object dato) {
        if (!vacia()) {
            Nodo aux = cima;
            int tamAux = tam;
            Pila pilaAux = new Pila();
            while (cima != null && cima.getDato() != dato) {
                pilaAux.apilar(cima.getDato());
                desapilar();
            }
            if (cima == null && tamAux == pilaAux.getTam()) {
                //esta condicion es en caso de que no se encuentre
                // el elemento a eliminar
                cima = aux;
            } else {
                //en caso de que si esté el elemento a eliminar
                desapilar();
                while (pilaAux.getCima() != null) {
                    apilar(pilaAux.getCima().getDato());
                    pilaAux.desapilar();
                }
            }
        }
    }


    //mostrar normal
    public String mostrar() {
        String salida = "";
        Nodo aux = cima;
        while (aux != null) {
            salida += aux.getDato() + " ";
            aux = aux.getSiguiente();
        }
        return salida;
    }

    //mostrar segun teoria
    //recorriendo todo usando la cima
    public String mostrarP() {
        String salida = "";
        Nodo aux = cima;
        while (cima != null) {
            salida += cima.getDato() + " ";
            cima = cima.getSiguiente();
        }
        cima = aux;
        //se recupera el valor de la cima
        return salida;
    }


    //Getter and Setter

    public Nodo getCima() {
        return cima;
    }

    public void setCima(Nodo cima) {
        this.cima = cima;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "Pila{" + "cima=" + cima + ", tam=" + tam + '}';
    }

}
