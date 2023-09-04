


public class Nodo {
    int dato, fe;// DECLARAMOS EL DATO Y EL FACTOR DE EQUILIBRIO
    Nodo hijoIzquierdo, hijoDerecho;

    public Nodo(int d) {
        this.dato = d;
        this.fe = 0;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
}
