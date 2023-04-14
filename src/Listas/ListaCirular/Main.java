package Listas.ListaCirular;

public class Main {
    public static void main(String[] args) {
        ListaCircular listaCir = new ListaCircular();
        String programas [] = {"Contaduría", "Administración", "Biología", "Química", "Sistemas"};

        for (int i = 1; i <= 8; i++) {
            int codigo = (int) (Math.random() * 1000) + 1000;
            int edad = (int) (Math.random() * 10) + 13;
            float nota = (float) (Math.random() * 4 + 1);
            listaCir.insertarOrdenado(new Estudiante(codigo, "Estudiante " + i, programas[(int) (Math.random() * 5)], edad, nota));
        }
        System.out.println(listaCir.mostrar());
        listaCir.girarRuleta();
        System.out.println(listaCir.mostrar());
    }
}
