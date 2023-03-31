import java.util.Arrays;

public class Practicando {

    public static void burbuja(int a[]) {
        int aux = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
    }

    public static void seleccion(int a[]) {
        int aux = 0;
        int cambios=0, ciclos=0;
        int min = 0;
        for (int i = 0; i < a.length; i++) {
            min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;

                }

            }
            ciclos++;
            if (min != i) {
                cambios++;
                aux = a[i];
                a[i] = a[min];
                a[min] = aux;
            }
        }
        System.out.println(cambios+" ciclos="+ciclos);
    }

    public static void shellsort(int numbers[]){
        int salto, aux, i;
        int changes=0;
        boolean cambios;
        for(salto=numbers.length/2; salto!=0; salto/=2){
            cambios=true;
            while(cambios){
                cambios=false;

                for(i=salto; i< numbers.length; i++)
                    if(numbers[i-salto]>numbers[i]){
                        aux=numbers[i];
                        numbers[i]=numbers[i-salto];
                        numbers[i-salto]=aux;
                        cambios=true;
                        changes++;
                    }
            }
        }
        System.out.println(changes);
    }


    public static void insercion(int a[]) {
        int c=0;
        int aux = 0;
        for (int i = 1; i < a.length; i++) {
            aux = a[i];
            for (int j = i - 1; j >= 0 && a[j] > aux; j--) {

                c++;
                a[j + 1] = a[j];
                a[j] = aux;
                System.out.println(Arrays.toString(a));

            }


        }
        System.out.println(c);
    }


    public static void main(String[] args) {
       // int a[] = new int[6];
        int a[] ={17, 27, 23, 24, 9, 17, 18, 16, 5};
        /*for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 30 + 1);
        }*/
        System.out.println("inicialmente-> "+Arrays.toString(a));

        shellsort(a);

    }
}
