package ListasClientes;

public class PrincipalEjercicio {
    public static void main(String[] args) {
        ListaObjetos compraYA = new ListaObjetos();
        for (int i = 1; i < 20; i++) {
            Cliente nuevo = new Cliente("N"+i);
            compraYA.agregarFin(nuevo);
        }
        System.out.println(compraYA.mostrar());
    }
}
