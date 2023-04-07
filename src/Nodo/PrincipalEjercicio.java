package Nodo;

public class PrincipalEjercicio {
    public static void main(String[] args) {
        ListaObjetos compraYA = new ListaObjetos();
        for (int i = 1; i < 20; i++) {
            Object nuevo = new Object("N"+i);
            compraYA.agregarFin(nuevo);
        }
        System.out.println(compraYA.mostrar());
    }
}
