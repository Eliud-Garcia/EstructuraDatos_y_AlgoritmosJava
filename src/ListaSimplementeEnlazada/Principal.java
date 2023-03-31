package ListaSimplementeEnlazada;

public class Principal {
    public static void main(String[] args) {
//        Lista lista1 = new Lista();
//        for (int i = 1; i <=20; i++) {
//            lista1.agregarFin(3);
//        }
//        System.out.println(lista1.mostrar());
//        Lista pares= lista1.listaDatosPares(lista1);
//        System.out.println(pares.mostrar());
//        System.out.println(pares.vacia());


//        //ejercicio 2
//        for (int i = 1; i <=20; i++) {
//            lista1.agregarFin(i);
//        }
//
//        System.out.println(lista1.mostrar());
//        lista1.ejercicio2();
//        System.out.println(lista1.mostrar());

        //ejercicio3
//        lista1.agregarFin(3);//1
//        lista1.agregarFin(1);//2
//        lista1.agregarFin(2);//3
//        lista1.agregarFin(1);//4
//        lista1.agregarFin(2);//5
//
//
//        System.out.println("cantidad=" + lista1.getCantidadElementos());
//        System.out.println(lista1.mostrar());
//        System.out.println(lista1.sum_ParesImpares());
//        lista1.ejercicio3();
//        System.out.println(lista1.mostrar());


        //EJERCICIO SOLO LOS NODOS > AL PROMEDIO
       /* Lista a = new Lista();
        a.agregarFin(1);
        a.agregarFin(1);
        a.agregarFin(5);
        a.agregarFin(4);
        a.agregarFin(3);
        a.agregarFin(4);

        System.out.println(a.sumatoriaDecimales());
        System.out.println(a.mostrar());
        Lista valoresMayores = a.mayoresPromedio();
        System.out.println(valoresMayores.mostrar());
        System.out.println(a.mostrar());*/

        //EJERCICIO -> ELIMINAR LOS DATOS IGUALES A N EN UNA LISTA
        Lista x = new Lista();
        for (int i = 0; i < 10; i++) {
            x.agregarFin((int)(Math.random()*4+1));
        }
        System.out.println(x.mostrar());
        x.eliminarValorN(2);
        System.out.println(x.mostrar());


    }


}
