package EjerciciciosCombinados;

public class Main {

    public static void generarLavadoras(Pila pila, int cantidad) {
        String revisores[] = {"Héctor Valdés", "Juan Galindo", "Pedro Peralta"};
        for (int i = 0; i < cantidad; i++) {
            Lavadora nuevaLavadora = new Lavadora((int)(Math.random()*10+1), "L" + i, revisores[(int) (Math.random() * revisores.length)]);
            if(nuevaLavadora.getCodigo()%10!=1){
                nuevaLavadora.setEstado(true);
                pila.apilar(nuevaLavadora);
            }else{
                nuevaLavadora.setEstado(false);
                pila.apilar(nuevaLavadora);
            }
        }
    }

    public static void hacerSolicitudes(Cola cola, int cantidad){
        for (int i = 0; i < cantidad; i++) {
            cola.encolar(new Tienda("T"+i, (int)(Math.random()*3+7)));
        }
    }



    public static void main(String[] args) {
        Pila lavadoras = new Pila();
        Lista pedidos = new Lista();
        Cola solicitudes = new Cola();


        generarLavadoras(lavadoras, 20);
        System.out.println(lavadoras.mostrar());

        hacerSolicitudes(solicitudes, 5);

        System.out.println(solicitudes.mostrar());


        Lista resultado = pedidos.entregarPedidos(lavadoras, solicitudes);
        System.out.println(resultado.mostrar());

        if(!solicitudes.vacia()){
            System.out.println("Pedidos pendientes");
            System.out.println(solicitudes.mostrar());
        }else{
            System.out.println("todos los pedidos entregados");
        }



    }
}
