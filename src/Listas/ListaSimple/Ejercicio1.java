package Listas.ListaSimple;

public class Ejercicio1 {
    public static void main(String[] args) {


        /*Realice un metodo que, recibiendo una lista, inserte un nuevo elemento con cero, después
        de todo elemento de la lista que contenga como dato la suma de todos los datos contenidos en la lista.*/

        Lista lista1 = new Lista();
        lista1.agregarFin(2);
        lista1.agregarFin(1);
        lista1.agregarFin(3);
        lista1.agregarFin(2);
        lista1.agregarFin(-6);
        lista1.agregarFin(-2);
        lista1.agregarFin(2);
        lista1.agregarFin(-1);
        lista1.agregarFin(2);
        lista1.agregarFin(-1);


        System.out.println(lista1.mostrar());
        System.out.println("Sumatoria= " + lista1.sumatoria());

        lista1.ejercicio1();
        System.out.println(lista1.mostrar());

    }
}
