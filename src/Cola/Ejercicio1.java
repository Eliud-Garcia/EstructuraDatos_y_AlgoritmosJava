package Cola;

public class Ejercicio1 {
    /*
    5. Implemente una Cola C de enteros, de tal manera que en el momento de insertar un número
    entero x, se debe verificar si este número se encuentra en la cola, si está contenido en esta,
    este debe ubicarse en la primera posición, conservando el orden del resto de los números
    enteros, si el valor de x no se encuentra en la cola, este debe ser encolado.
    * */
    public static void main(String[] args) {
        Cola cola = new Cola();
        System.out.println(cola.mostrar());
        cola.encolar(1);
        cola.encolar(9);
        cola.encolar(3);

        cola.ejercicio1(0);
        System.out.println(cola.mostrar());
    }
}
