package Listas.ListaDoble;

public class Main {
    public static void main(String[] args) {
        //ejercicio-> saber si una palabra
        Lista lista = new Lista();
        String palabra = "aibofobia";

        for (int i = 0; i < palabra.length(); i++) {
            lista.agregarFin(palabra.charAt(i));
        }

        System.out.println(lista.mostrarInicioFin());
        System.out.println(lista.palabraPalindroma());

        //Ejercicio-> invertir una lista
        Lista invertir = new Lista();

        invertir.agregarFin(3);
        invertir.agregarFin(4);
        invertir.agregarFin(7);
        invertir.agregarFin(8);
        invertir.agregarFin(9);

        System.out.println(invertir.mostrarInicioFin());
        invertir.insertarLista();
        System.out.println(invertir.mostrarInicioFin());



    }
}
