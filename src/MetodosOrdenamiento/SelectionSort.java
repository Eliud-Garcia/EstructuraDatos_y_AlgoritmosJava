package MetodosOrdenamiento;

import java.util.Arrays;

public class SelectionSort {


    // Con codigo de la Universidad
    public static void selectionsort(int numeros[]) {
        int min = 0;
        int aux = 0;
        for (int i = 0; i < numeros.length; i++) {
            min = i;
            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[j] < numeros[min]) {
                    min = j;
                }
            }
            if (min != i) {
                aux = numeros[i];
                numeros[i] = numeros[min];
                numeros[min] = aux;
            }

        }
    }


    public static void main(String[] args) {
        int a[] = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 40 + 1);
        }

        selectionsort(a);
        System.out.println("Finalmente\n" + Arrays.toString(a));
    }
}
