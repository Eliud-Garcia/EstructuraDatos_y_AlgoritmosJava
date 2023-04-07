package ListaDoblementeEnlazada;

public class Lista {

    private Nodo inicio;
    private Nodo fin;
    private int cantidad;

    public Lista() {
        this.inicio = null;
        this.fin = null;
        this.cantidad = 0;
    }

    public boolean vacia() {
        return inicio == null && fin == null;
    }

    public void agregarInicio(Object dato) {
        if (vacia()) {
            inicio = fin = new Nodo(dato, null, null);
        } else {
            Nodo nuevo = new Nodo(dato, inicio, null);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
        cantidad++;
    }

    public void agregarFin(Object dato) {
        if (vacia()) {
            inicio = fin = new Nodo(dato, null, null);
        } else {
            Nodo nuevo = new Nodo(dato, null, fin);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        cantidad++;
    }

    public boolean palabraPalindroma() {
        if (!vacia()) {
            int mitad = (int) (this.getCantidad() / 2);
            int i = 0;
            Nodo primero = inicio;
            Nodo ultimo = fin;
            while (i < mitad) {
                if (primero.getDato() == ultimo.getDato()) {
                    primero = primero.getSiguiente();
                    ultimo = ultimo.getAnterior();
                } else {
                    return false;
                }
                i++;
            }
            return true;
        }
        return false;
    }

    // para buscar un elemento
    public boolean buscar(Object dato) {
        if (!vacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                //verifica si el objeto que entra por parametro es de la misma clase
                //y si es el elemento que se está buscando
                if (dato.getClass().equals(aux.getDato().getClass()) && dato.equals(aux.getDato())) {
                    return true;
                }
                aux = aux.getSiguiente();
            }
        }
        return false;
    }

    public void venderProducto(int codigo) {
        Producto aVender = buscarProducto(codigo);
        if (aVender != null) {
            aVender.vender();
        }
    }

    public Lista cantidadBodegaCero() {
        Producto producto = null;
        if (!vacia()) {
            Lista salida = new Lista();
            Nodo aux = inicio;
            while (aux != null) {
                //verifica si el objeto que entra por parametro es de la misma clase
                //y si es el elemento que se está buscando
                if (aux.getDato() instanceof Producto) {
                    producto = (Producto) (aux.getDato());
                    if (producto.getCantidadBodega() == 0) {
                        salida.agregarFin(producto);
                    }

                }
                aux = aux.getSiguiente();
            }
            return salida;
        }
        return null;
    }

    public Lista masVendidos() {


        if (!vacia()) {
            Lista salida = new Lista();
            Nodo aux = inicio;
            int valorMax = 0;
            while (aux != null) {

                if (aux.getDato() instanceof Producto) {
                    Producto productoAux = (Producto) (aux.getDato());
                    if (productoAux.getCantidadVendida() > valorMax) {
                        valorMax = productoAux.getCantidadVendida();
                        salida.agregarInicio(productoAux);
                    } else {
                        salida.agregarFin(productoAux);
                    }


                }
                aux = aux.getSiguiente();
            }
            return salida;
        }
        return null;
    }

    public Producto buscarProducto(int codigo) {
        Producto salida = null;
        if (!vacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                //verifica si el objeto que entra por parametro es de la misma clase
                //y si es el elemento que se está buscando
                if (aux.getDato() instanceof Producto) {
                    salida = (Producto) (aux.getDato());
                    if (salida.getCodigo() == codigo) {
                        return salida;
                    }

                }
                aux = aux.getSiguiente();
            }
        }
        return salida;
    }

    //Para eliminar el inicio
    public void eliminarInicio() {
        if (!vacia()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);
            }
            cantidad--;
        }
    }

    //para eliminar el fin
    public void eliminarFin() {
        if (!vacia()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                fin = fin.getAnterior();
                fin.setSiguiente(null);
            }
            cantidad--;
        }
    }

    //mostrar cada uno de los datos
    public String mostrarFinInicio() {
        String salida = "";
        if (!vacia()) {
            Nodo aux = fin;
            while (aux != null) {
                salida += aux.getDato() + "\n";
                aux = aux.getAnterior();
            }
        }
        return salida;
    }

    public void insertarLista() {
        Nodo primero = inicio;
        Nodo ultimo = fin;

        for (int i = 0; i < this.cantidad / 2; i++) {
            Object aux = primero.getDato();
            primero.setDato(ultimo.getDato());
            ultimo.setDato(aux);
            ultimo = ultimo.getAnterior();
            primero = primero.getSiguiente();
        }


    }

    public String mostrarInicioFin() {
        String salida = "";
        if (!vacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                salida += aux.getDato() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return salida;
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

}
