package GestionArrays;

import java.util.Arrays;

public class MetodoCopyOf {
    public static int arr[] = new int[3];
    public static int pos=0;
    public static void ingresar(int nuevo){
        //usando Arrays.copyOf en caso de que el arreglo este lleno
        if(arr.length==pos){
            arr= Arrays.copyOf(arr, arr.length*2);
            arr[pos]=nuevo;
            pos++;
        }else{
            arr[pos]=nuevo;
            pos++;
        }
    }

    public static boolean eliminar(int i) {
        boolean salida = false;
        if(i>=0 && i<pos){
            if (arr[i] != 0) {
                arr[i] = 0;
                if (pos - 1 != i) {
                    System.arraycopy(arr, i + 1, arr, i, pos - (i + 1));
                    arr[pos - 1] = 0;
                    i--;
                    salida = true;
                }
                pos--;
            }
        }
        return salida;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            ingresar((int)(Math.random()*50+1));
        }
        System.out.println("inicialmente: "+Arrays.toString(arr));
        System.out.println(eliminar(0));
        System.out.println("inicialmente: "+Arrays.toString(arr));

    }
}
