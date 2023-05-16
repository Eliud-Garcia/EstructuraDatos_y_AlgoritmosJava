package Arboles.arbolBinario;

public class Main {

    public static void main(String[] args) {
        ArbolBinario ArbolBinario = new ArbolBinario();

        for (int i = 1; i <= 100; i++) {
            ArbolBinario.insertar(new Estudiante(i, "Estudiante " + i, Math.round((Math.random() * 4 + 1) * 100.0) / 100.0));
        }
        System.out.println(ArbolBinario.inOrden(ArbolBinario.getRaiz()) + "\n");
        System.out.println(ArbolBinario.preOrden(ArbolBinario.getRaiz()) + "\n");
        System.out.println(ArbolBinario.postOrden(ArbolBinario.getRaiz()) + "\n");
        ArbolBinario.eliminarReprobados(ArbolBinario.getRaiz());
        System.out.println(ArbolBinario.inOrden(ArbolBinario.getRaiz()));
        System.out.println("Número de estudiantes aprobados : " + ArbolBinario.numeroEstudiante(ArbolBinario.getRaiz()));

    }
}
