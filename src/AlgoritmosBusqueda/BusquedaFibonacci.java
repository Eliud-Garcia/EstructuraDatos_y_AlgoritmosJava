package AlgoritmosBusqueda;

import java.util.Arrays;

public class BusquedaFibonacci {


    public static int fibSearch(int arr[], int x) {
        //Arrays.sort(arr); en caso de que no esté ordenado

        int n = arr.length;

        /* sucesion de Fibonacci */
        int a = 0;
        int b = 1;
        int c = a + b;

        while (c < n) {
            a = b;
            b = c;
            c = a + b;
        }


        int offset = -1;


        while (c > 1) {

            int i = Math.min(offset + a, n - 1);


            if (arr[i] < x) {
                c = b;
                b = a;
                a = c - b;
                offset = i;
            } else if (arr[i] > x) {
                c = a;
                b = b - a;
                a = c - b;
            } else {
                return i;
            }

        }


        if (b == 1 && arr[n - 1] == x) {
            return n - 1;
        } else {
            return -1;
        }


    }

    public static void main(String[] args) {
        int a[] = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 30 + 1);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println((fibSearch(a, 25)));

    }

}
