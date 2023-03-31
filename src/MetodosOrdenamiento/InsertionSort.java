package MetodosOrdenamiento;

public class InsertionSort {
    //codigo copiado
    public static void insetionSort(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }

    //Codigo en la Univesidad
    public static void insertionsort(int a[]){
        int aux;
        for (int i = 1; i < a.length; i++) {
            aux = a[i];
            for (int j = i-1; j >=0 && a[j]>aux; j--) {
                a[j+1]=a[j];
                a[j]=aux;
            }
        }
    }


    // Driver method
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};




    }
}
