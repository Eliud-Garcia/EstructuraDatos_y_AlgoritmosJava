package ListaDoblementeEnlazada;

import java.util.Scanner;

public class EjercicioMercaMerca {
    public static void main(String[] args) {
        Lista mercaMerca = new Lista();
        int codigo = 0;
        String nombre = "";
        double precioUnitario = 0;
        int cantidadBodega = 0;
        int opcion;
        Scanner en = new Scanner(System.in);

        do {
            System.out.println("1. Registrar nuevo producto");
            System.out.println("2. Registrar productos aleatorios");
            System.out.println("3. Mostrar todos los productos");
            System.out.println("4. Comprar productos");
            System.out.println("5. Productos con cantidad enBodega en cero");
            System.out.println("6. Productos mas vendidos");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = en.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("codigo");
                    codigo = en.nextInt();
                    System.out.println("nombre");
                    nombre = en.next();
                    System.out.println("precio");
                    precioUnitario = en.nextDouble();
                    System.out.println("cant. Bodega");
                    cantidadBodega = en.nextInt();
                    mercaMerca.agregarFin(new Producto(codigo, nombre, precioUnitario, cantidadBodega));
                }
                case 2 -> {
                    System.out.println("cantidad a generar");
                    int cantidad = en.nextInt();
                    for (int i = 0; i < cantidad; i++) {
                        mercaMerca.agregarFin(new Producto(i, "P" + i, (Math.random() * 2000), (int) (Math.random() * 15)));
                    }
                }
                case 3 -> System.out.println(mercaMerca.mostrarInicioFin());
                case 4 -> {
                    System.out.println("\n Ingrese el codigo del producto");
                    codigo = en.nextInt();
                    mercaMerca.venderProducto(codigo);
                }
                case 5 -> {
                    System.out.println("\n");
                    Lista bodegaCero = mercaMerca.cantidadBodegaCero();
                    System.out.println(bodegaCero.mostrarInicioFin());
                }
                case 6 -> {
                    System.out.println("\n");
                    Lista masVentas = mercaMerca.masVendidos();
                    System.out.println(masVentas.mostrarInicioFin());
                }
                case 7 -> System.out.println(" ha salido");
                default -> System.out.println("Accion no valida");
            }
        } while (opcion != 7);
    }
}
