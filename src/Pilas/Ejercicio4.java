package Pilas;

public class Ejercicio4 {
    /*
    Implemente una solución que recibiendo como parámetros dos Pilas p1 y p2. Borre de la
    pila p1 todos los elementos que se encuentran en la pila P2, tal como se muestra en la
    imagen.

    EJEMPLO:
    pila1 = 1 2 4 5 6
    pila2 = 2 3 6 9

    la pila 1 debe de quedar = 1 4 5

    */
    public static void main(String[] args) {
        Pila pila1 = new Pila();
        Pila pila2 = new Pila();

        pila1.apilar(6);
        pila1.apilar(5);
        pila1.apilar(4);
        pila1.apilar(2);
        pila1.apilar(1);

        pila2.apilar(9);
        pila2.apilar(6);
        pila2.apilar(3);
        pila2.apilar(2);
        System.out.println(pila1.mostrar()+"\n");

        pila1.ejercicio4(pila1, pila2);
        System.out.println(pila1.mostrar());
        System.out.println(pila2.mostrar());



    }
}
