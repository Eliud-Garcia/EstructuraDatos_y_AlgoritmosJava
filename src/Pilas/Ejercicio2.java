

package Pilas;

/*
    Se pide implementar un método que recibiendo como parámetro una pila P de enteros,
    ingrese en el fondo de la pila el número entero menor, además se debe eliminar todos los
    enteros que coincidan con el menor. En la figura de la izquierda se presenta la pila P original
    y en la figura de la derecha se presenta la misma pila P luego de la ejecución del método.

*/

public class Ejercicio2 {

    public static void main(String[] args) {
        Pila pila = new Pila();
        
        pila.apilar(9);
        pila.apilar(9);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(2);
        pila.apilar(8);
        pila.apilar(2);
        pila.apilar(7);
        pila.apilar(9);
        pila.apilar(1);
        System.out.println(pila.mostrar());
        pila.ejercicio2();
        System.out.println(pila.mostrar());
    }
    
}
