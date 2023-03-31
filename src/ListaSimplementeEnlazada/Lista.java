package ListaSimplementeEnlazada;

public class Lista {

    private Nodo inicio;
    private Nodo fin;
    private int cantidadElementos;

    public Lista() {
        this.inicio = null;
        this.fin = null;
        this.cantidadElementos = 0;
    }

    //para saber si está vacia
    public boolean vacia() {
        return (inicio == null && fin == null);
    }

    public int sumatoria() {
        int suma = 0;
        Nodo aux = this.inicio;
        while (aux != null) {
            suma += aux.getDato();
            aux = aux.getSiguiente();
        }
        return suma;
    }

    public void ejercicio1() {
        int sum = sumatoria();
        Nodo aux = this.inicio;
        while (aux.getSiguiente() != null) {
            if (aux.getDato() == sum) {
                if (inicio.getDato() == sum) {
                    aux.setSiguiente(new Nodo(0, aux.getSiguiente()));
                } else {
                    aux.setSiguiente(new Nodo(0, aux.getSiguiente()));
                    cantidadElementos++;
                }
            }
            aux = aux.getSiguiente();
        }
        if (fin.getDato() == sum) {
            agregarFin(0);
        }
    }

    public void ejercicio2() {
        Nodo aux = inicio;
       if(!vacia()){
           if (this.cantidadElementos % 2 == 0) {
               //solo deja los pares
               eliminarInicio();
               aux=inicio;
               while (aux.getSiguiente()!=null){
                   aux.setSiguiente(aux.getSiguiente().getSiguiente());
                   aux=aux.getSiguiente();
                   cantidadElementos--;
               }
               
           } else {
               aux=inicio;
               while (aux.getSiguiente()!=null){
                   aux.setSiguiente(aux.getSiguiente().getSiguiente());
                   cantidadElementos--;
                   aux=aux.getSiguiente();
               }
           }
       }
    }

    public void ejercicio3() {
        if (!vacia()) {
            Nodo aux;
            //borra los pares
            if(sum_ParesImpares()){
                if(cantidadElementos%2==0){
                    aux=inicio;
                    while (aux.getSiguiente()!=fin){
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                        aux=aux.getSiguiente();
                        cantidadElementos--;
                    }
                    fin=aux;
                    fin.setSiguiente(null);
                }else{
                    aux=inicio;
                    while (aux.getSiguiente()!=null){
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                        aux=aux.getSiguiente();
                        cantidadElementos--;
                    }

                }
            }else{
                eliminarInicio();

                if(cantidadElementos%2==0){
                    //borra impares
                    aux=inicio;
                    while (aux.getSiguiente()!=null){
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                        aux=aux.getSiguiente();
                        cantidadElementos--;
                    }
                }else{
                    aux=inicio;
                    while (aux.getSiguiente()!=fin){
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                        aux=aux.getSiguiente();
                        cantidadElementos--;
                    }
                    fin=aux;
                    fin.setSiguiente(null);
                }
            }


        }

    }

    public Lista listaDatosPares(Lista a){
        Lista salida = new Lista();
        if(!a.vacia()){

            Nodo aux=a.getInicio();
            while (aux!=null){
                if(aux.getDato()%2==0){
                    salida.agregarFin(aux.getDato());
                    salida.cantidadElementos++;
                }
                aux=aux.getSiguiente();
            }
        }
        return salida;
    }
    public double sumatoriaDecimales() {
        double suma = 0;
        Nodo aux = this.inicio;
        while (aux != null) {
            suma += aux.getDato();
            aux = aux.getSiguiente();
        }
        return suma;
    }
    public Lista mayoresPromedio(){
        Lista salida = new Lista();
        if(!vacia()){
            double promedio = sumatoriaDecimales()/cantidadElementos;
            Nodo aux=inicio;
            while (aux!=null){
                if(aux.getDato()>=promedio){
                    salida.agregarFin(aux.getDato());
                    salida.cantidadElementos++;
                }
                aux=aux.getSiguiente();
            }
        }
        return salida;
    }

    public void eliminarValorN(int n){
        Nodo aux=inicio;
        while (aux.getSiguiente()!=null){
            if(inicio.getDato()==n){
                eliminarInicio();
                aux=inicio;
            }else if(aux.getSiguiente().getDato()==n){
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                cantidadElementos--;
            }
            aux=aux.getSiguiente();

        }
        if(fin.getDato()==n){
            eliminarFin();
        }
    }

    public boolean sum_ParesImpares() {
        Nodo aux = this.inicio;
        int sumPares = 0;
        int sumImpares = 0;
        if (!vacia()) {
            for (int i = 1; i <= this.cantidadElementos; i++) {
                if (i % 2 == 0) {
                    sumPares += aux.getDato();
                } else {
                    sumImpares += aux.getDato();
                }
                aux = aux.getSiguiente();
            }

        }
        return sumImpares == sumPares;
    }

    public void eliminar(int elemento) {
        if (!vacia()) {
            if (inicio == fin && elemento == inicio.getDato()) {
                inicio = fin = null;
            } else if (elemento == inicio.getDato()) {
                inicio = inicio.getSiguiente();
            } else {
                Nodo anterior = inicio;
                Nodo temporal = inicio.getSiguiente();
                while (temporal != null && temporal.getDato() != elemento) {
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


    public void agregarInicio(int elemento) {
        if (vacia()) {
            fin = inicio = new Nodo(elemento);
        } else {
            inicio = new Nodo(elemento, inicio);
        }
        cantidadElementos++;
    }

    public void agregarFin(int elemento) {
        if (vacia()) {
            agregarInicio(elemento);

        } else {
            fin.setSiguiente(new Nodo(elemento));
            fin = fin.getSiguiente();
            cantidadElementos++;
        }

    }

    public void insertarOrdenado(int elemento) {
        if (vacia()) {
            agregarInicio(elemento);
        } else {
            if (elemento <= inicio.getDato()) {
                agregarInicio(elemento);
            } else if (elemento >= fin.getDato()) {
                agregarFin(elemento);
            } else {
                Nodo aux = inicio;
                while (elemento > aux.getSiguiente().getDato()) {
                    aux = aux.getSiguiente();
                }
                Nodo nuevo = new Nodo(elemento, aux.getSiguiente());
                aux.setSiguiente(nuevo);
                cantidadElementos++;
            }
        }
    }

    public String mostrar() {
        String salida = "";
        Nodo aux = inicio;
        while (aux != null) {
            salida += aux.getDato() + ", ";
            aux = aux.getSiguiente();
        }
        return salida;

    }


    public int eliminarInicio() {
        int datoEliminado = inicio.getDato();
        if (!vacia()) {
            if (inicio == fin) {
                inicio = null;
                fin = null;

            } else {

                inicio = inicio.getSiguiente();
            }
            cantidadElementos--;
        }

        return datoEliminado;
    }

    public int eliminarFin() {
        int datoEliminado = fin.getDato();
        Nodo aux = inicio;
        if (!vacia()) {
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
        return datoEliminado;
    }

    public boolean buscar(int i) {
        if (!vacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                if (aux.getDato() == i) {
                    return true;
                }
                aux = aux.getSiguiente();
            }
        }
        return false;
    }

    public Nodo buscarNodo(int i) {
        if (!vacia()) {
            Nodo aux = inicio;
            while (aux != fin) {
                if (aux.getSiguiente().getDato() == i) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    public void eliminarPares() {
        if (!vacia()) {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                if (inicio.getDato() % 2 == 0) {
                    eliminarInicio();
                    aux = inicio;

                } else if (aux.getSiguiente().getDato() % 2 == 0) {
                    if (aux.getSiguiente() == fin) {
                        fin = aux;
                        fin.setSiguiente(null);
                        cantidadElementos--;

                    } else {
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    }
                    cantidadElementos--;
                } else {
                    aux = aux.getSiguiente();
                }
            }
            if (inicio == fin && inicio.getDato() % 2 == 0) {
                inicio = fin = null;
                cantidadElementos--;
            }
        }
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

    public int getCantidadElementos() {
        return cantidadElementos;
    }

    public void setCantidadElementos(int cantidadElementos) {
        this.cantidadElementos = cantidadElementos;
    }
}
