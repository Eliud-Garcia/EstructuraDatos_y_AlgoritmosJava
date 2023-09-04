


public class Main {

   
    public static void main(String[] args) {
        
        ArbolAVL arbol = new ArbolAVL();
       
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(13);
        arbol.insertar(17);
        arbol.insertar(16);
        
        arbol.preOrder(arbol.obtenerRaiz()); 
        
    }
    
}
