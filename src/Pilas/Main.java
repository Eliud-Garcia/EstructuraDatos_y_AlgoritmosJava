package Pilas;

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.apilar(8);
        pila.apilar(5);
        pila.apilar(2);
        pila.apilar(4);
        pila.apilar(6);

        System.out.println(pila.mostrar());
        pila.eliminar(6);
        System.out.println(pila.mostrar());
    }
}
