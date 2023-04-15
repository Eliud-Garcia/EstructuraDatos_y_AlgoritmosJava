/*
 * Implemente una Pila P de enteros, de tal manera que en el momento de insertar un número
    entero x, se debe verificar si este número se encuentra en la pila, si está contenido en esta,
    este debe subir hasta la cima, conservando el orden del resto de los número enteros, si el
    valor de x no se encuentra en la pila, este debe ser apilado.

 */
package Pilas;


public class Ejercicio3 {

    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.apilar(5);
        pila.apilar(7);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(9);
        pila.apilar(5);
        pila.apilar(4);
        System.out.println(pila.mostrar());
        pila.ejercicio3(9);
        System.out.println(pila.mostrar());
    }
    
}
