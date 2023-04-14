package Listas.ListaCirular;

public class ListaCircular {

    private Nodo inicio;
    private Nodo fin;
    private int cantidad;

    public ListaCircular() {
        this.inicio = null;
        this.fin = null;
        this.cantidad = 0;
    }

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

    public boolean vacia() {
        return inicio == null && fin == null;
    }

    public void agregarInicio(Estudiante dato) {
        if (vacia()) {
            inicio = fin = new Nodo(dato, inicio);
        } else {
            inicio = new Nodo(dato, inicio);
        }
        fin.setSiguiente(inicio);
        cantidad++;
    }

    public void agregarFinal(Estudiante dato) {
        if (vacia()) {
            inicio = fin = new Nodo(dato, inicio);
        } else {
            Nodo nuevo = new Nodo(dato, inicio);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        cantidad++;
    }

    public void insertarOrdenado(Estudiante dato) {
        if (!vacia()) {
            if (dato.getEdad() <= inicio.getDato().getEdad()) {
                agregarInicio(dato);
            } else if (dato.getEdad() >= fin.getDato().getEdad()) {
                agregarFinal(dato);
            } else {
                Nodo aux = inicio;
                while (dato.getEdad() >= aux.getSiguiente().getDato().getEdad()) {
                    aux = aux.getSiguiente();
                }
                Nodo nuevo = new Nodo(dato, aux.getSiguiente());
                aux.setSiguiente(nuevo);
                cantidad++;
            }
        } else {
            agregarFinal(dato);
        }
    }

    public void eliminar() {
        if (!vacia()) {
            Nodo aux = inicio;
            while (aux != fin) {
                if (inicio.getDato().getEdad() < 18) {
                    eliminarPrimero();
                    aux = inicio;
                } else if (aux.getSiguiente().getDato().getEdad() < 18) {
                    if (aux.getSiguiente() == fin) {
                        fin = aux;
                        fin.setSiguiente(inicio);
                    } else {
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    }
                    cantidad--;
                } else {
                    aux = aux.getSiguiente();
                }
            }
            if (inicio == fin && inicio.getDato().getEdad() < 18) {
                fin = inicio = null;
                cantidad--;
            }
        }
    }

    public void eliminarPrimero() {
        if (!vacia()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                inicio = inicio.getSiguiente();
                fin.setSiguiente(inicio);
            }
            cantidad--;
        }
    }

    public void eliminarUltimo() {
        if (!vacia()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                Nodo aux = inicio;
                while (aux.getSiguiente() != fin) {
                    aux = aux.getSiguiente();
                }
                fin = aux;
                fin.setSiguiente(inicio);
            }
            cantidad--;
        }
    }

    public void girarRuleta() {
        int aleatorio = (int) (Math.random() * 30 + 1);
        System.out.println("aleatorio " + aleatorio);
        if (aleatorio > cantidad) {
            aleatorio = aleatorio % cantidad;
        }
        if (aleatorio % cantidad == 0) {
            eliminarPrimero();
            return;
        }
        Nodo aux = inicio;
        for (int i = 1; i < aleatorio; i++) {
            aux = aux.getSiguiente();
        }
        if (aux.getSiguiente() == fin) {
            fin = aux;
            fin.setSiguiente(inicio);
        } else {
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
        cantidad--;
    }

    public String mostrar() {
        String lista = "";
        if (!vacia()) {
            Nodo aux = inicio;
            do {
                lista += aux.getDato() + "\n";
                aux = aux.getSiguiente();
            } while (aux != inicio);
        }
        return lista;
    }
}
