package MetodosOrdenamiento;

public class QuickSort {
    public static void intercambiar(double[] a, int i, int j) {
        double aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    public static void quicksort(double a[]) {
        quicksort(a, 0, a.length - 1);
    }

    private static void quicksort(double a[], int primero, int ultimo) {
        int i, j, central;
        double pivote;
        central = (primero + ultimo) / 2;
        pivote = a[central];
        i = primero;
        j = ultimo;
        do {
            while (a[i] < pivote) i++;
            while (a[j] > pivote) j--;
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j)
            quicksort(a, primero, j); // mismo proceso con sublista izquierda
        if (i < ultimo)
            quicksort(a, i, ultimo); // mismo proceso con sublista derecha
    }


    //Codigo U
    public static void quicksort(int A[], int izq, int der) {

        int pivote = A[izq];
        int i = izq;
        int j = der;
        int aux;

        //pivote = 10
        //i = 4
        //j = 4
        //aux = 0

        while (i < j) {

            while (A[i] <= pivote && i < j) i++;

            while (A[j] > pivote) j--;

            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j];
        A[j] = pivote;
        if (izq < j - 1)
            quicksort(A, izq, j - 1);
        if (j + 1 < der)
            quicksort(A, j + 1, der);
    }

    public static void main(String[] args) {
        double a[] = new double[10000];
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * 4000;
        }

        quicksort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

    }
}
