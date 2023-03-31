package MetodosOrdenamiento;


import java.util.Arrays;

public class BubbleSort {

    //se asegura que en la primera iteracion de i quede ubicado el elemento menor
    public static void blubbleSort1(int arr[]) {
        int aux = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }

    }



    public static void blubbleSort2(int[] arr) {
        int aux = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
                //codigo extra para ir mostrando cambios

            }
        }
    }

    public static void main(String[] args) {
        int a[] = new int[20];
        int b []={3, 8, 4, 5, 10, 20, 3, 5, 1 };
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 40 + 1);
        }


        blubbleSort1(b);
        System.out.println("Finalmente\n" + Arrays.toString(b));

    }
}
