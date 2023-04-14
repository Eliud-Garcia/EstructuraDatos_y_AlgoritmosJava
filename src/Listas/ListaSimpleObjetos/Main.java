package Listas.ListaSimpleObjetos;

public class Main {
    public static void main(String[] args) {

        ListaObjetos compraYA = new ListaObjetos();

        for (int i = 1; i < 20; i++) {
            Contratador nuevo = new Contratador("N" + i);
            compraYA.agregarFin(nuevo);
        }
        System.out.println(compraYA.mostrar());
    }
}
