package EjerciciciosCombinados.ejercicio1;

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

    public void ejercicio1(int x) {
        if (!vacia()) {
            Pila aux = new Pila();

            while (!vacia()) {
                aux.apilar(cima.getDato());
                desapilar();
            }

            while (!aux.vacia()) {
                for (int i = 0; i < x; i++) {
                    apilar(aux.getCima().getDato());
                }
                aux.desapilar();
            }

        }
    }

    public void ejercicio2() {
        if (!vacia()) {
            Pila aux = new Pila();

            int menor = (int) (cima.getDato());

            //para vaciar la pila
            while (!vacia()) {

                if ((int) (cima.getDato()) < menor) {
                    menor = (int) (cima.getDato());
                }
                aux.apilar(cima.getDato());
                desapilar();
            }

            apilar(menor); // se ubica el menor

            while (!aux.vacia()) {
                if (!aux.getCima().getDato().equals(menor)) {
                    apilar(aux.getCima().getDato());
                }
                aux.desapilar();

            }
        }
    }

    public void ejercicio3(Object dato) {
        if (!vacia()) {
            boolean flag = false;
            Pila aux = new Pila();
            while (!vacia()) {
                if (cima.getDato().equals(dato)) {
                    flag = true;
                }
                aux.apilar(cima.getDato());
                desapilar();
            }

            if (!flag) {

                while (!aux.vacia()) {
                    apilar(aux.getCima().getDato());
                    aux.desapilar();
                }
                apilar(dato);
            } else {
                while (!aux.vacia()) {
                    if (!aux.getCima().getDato().equals(dato)) {
                        apilar(aux.getCima().getDato());
                    }
                    aux.desapilar();
                }
                apilar(dato);
            }
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
            salida += aux.getDato() + "\n";
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
