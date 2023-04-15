

package Pilas;



public class Ejercicio1 {
    /*
        Se pide implementar un método que recibiendo como parámetro una pila P de enteros y
        un número entero x, retorne la misma pila, en la que cada elemento de la pila P se repita
        las x veces. En el gráfico 1, se presenta un ejemplo de la implementación, donde se tiene
        la pila de la Figura 1 y siendo x=2, se debe retornar la pila como se muestra en la figura 2.

    */

    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.apilar(3);
        pila.apilar(2);
        pila.apilar(1);
        System.out.println(pila.mostrar());
        pila.ejercicio1(2);
        System.out.println(pila.mostrar());
    }
    
}
