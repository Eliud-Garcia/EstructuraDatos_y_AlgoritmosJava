
package Cola;


public class Main {

    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.encolar(3);
        cola.encolar(4);
        cola.encolar(5);
        cola.encolar(6);
        cola.encolar(3);
        cola.encolar(4);
        cola.encolar(5);
        cola.encolar(6);
        
        System.out.println(cola.mostrar());
        cola.eliminar(3);
        System.out.println(cola.mostrar());
        
        
    }
    
}
