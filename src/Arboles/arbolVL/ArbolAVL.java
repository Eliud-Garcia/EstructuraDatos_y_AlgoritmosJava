

public class ArbolAVL {
    private Nodo raiz;

    // CREAMOS CONSTRUCTOR
    public ArbolAVL() {
        raiz = null;
    }

    public Nodo obtenerRaiz() {
        return raiz;
    }

    // BUSCAR NODO EN EL ARBOL
    public Nodo buscar(int d, Nodo r) {
        if (raiz == null) {// VERIFICAMOS QUE NUESTRO ARBOL TENGA ALGUN CONTENIDO
            return null;// SI NO ES ASI RETORNAMOS UN VALOR NULO
        } else if (r.dato == d) {
            return r; // CUANDO ENCONTREMOS EL VALOR RETORNAMOS EL NODO
        } else if (r.dato < d) {
            // SI NUESTRO VALOR DEL NODO ES MENOR QUE NUESTRO DATO RETORNAMOS NUESTRO NODO
            // DERECHO
            return buscar(d, r.hijoDerecho);
        } else {
            // SI NO RETORNAMOS NUESTRO NODO IZQUIERDO
            return buscar(d, r.hijoIzquierdo);
        }

    }

    // METODO PARA OBTENER EL FACTOR DE EQUILIBRIO
    public int obtenerFE(Nodo x) {
        if (x == null) {
            return -1;
        } else {
            return x.fe;
        }
    }

    // ROTACION SIMPLE IZQUIERDA
    public Nodo rotacionIzquierda(Nodo c) {
        Nodo auxiliar = c.hijoIzquierdo;
        c.hijoIzquierdo = auxiliar.hijoDerecho;
        auxiliar.hijoDerecho = c;
        c.fe = Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho)) + 1;
        auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho)) + 1;
        return auxiliar;
    }

    // ROTACION SIMPLE DERECHA
    public Nodo rotacionDerecha(Nodo c) {
        Nodo auxiliar = c.hijoDerecho;
        c.hijoDerecho = auxiliar.hijoIzquierdo;
        auxiliar.hijoIzquierdo = c;
        c.fe = Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho)) + 1;
        auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho)) + 1;
        return auxiliar;
    }

    // ROTACION DOBLE A LA IZQUIERDA
    public Nodo rotacionDobleIzquierda(Nodo c) {
        Nodo temporal;
        c.hijoIzquierdo = rotacionDerecha(c.hijoIzquierdo);
        temporal = rotacionIzquierda(c);
        return temporal;
    }

    // ROTACION DOBLE A LA DERECHA
    public Nodo rotacionDobleDerecha(Nodo c) {
        Nodo temporal;
        c.hijoDerecho = rotacionIzquierda(c.hijoDerecho);
        temporal = rotacionDerecha(c);
        return temporal;
    }

    // METODO PARA INSERTAR AVL
    public Nodo insertarAVL(Nodo nuevo, Nodo subAr) {
        Nodo nuevoPadre = subAr;
        if (nuevo.dato < subAr.dato) {
            if (subAr.hijoIzquierdo == null) {
                subAr.hijoIzquierdo = nuevo;
            } else {
                subAr.hijoIzquierdo = insertarAVL(nuevo, subAr.hijoIzquierdo);
                if ((obtenerFE(subAr.hijoIzquierdo) - obtenerFE(subAr.hijoDerecho) == 2)) {
                    if (nuevo.dato < subAr.hijoIzquierdo.dato) {
                        nuevoPadre = rotacionIzquierda(subAr);
                    } else {
                        nuevoPadre = rotacionDobleIzquierda(subAr);
                    }
                }
            }
        } else if (nuevo.dato > subAr.dato) {
            if (subAr.hijoDerecho == null) {
                subAr.hijoDerecho = nuevo;
            } else {
                subAr.hijoDerecho = insertarAVL(nuevo, subAr.hijoDerecho);
                if ((obtenerFE(subAr.hijoDerecho) - obtenerFE(subAr.hijoIzquierdo) == 2)) {
                    if (nuevo.dato > subAr.hijoDerecho.dato) {
                        nuevoPadre = rotacionDerecha(subAr);
                    } else {
                        nuevoPadre = rotacionDobleDerecha(subAr);
                    }
                }
            }
        } else {
            System.out.println("Nodo Duplicado");
        }
        // ACTUALIZAR ALTURA
        if ((subAr.hijoIzquierdo == null) && (subAr.hijoDerecho != null)) {
            subAr.fe = subAr.hijoDerecho.fe + 1;
        } else if ((subAr.hijoDerecho == null) && (subAr.hijoIzquierdo != null)) {
            subAr.fe = subAr.hijoIzquierdo.fe + 1;
        } else {
            subAr.fe = Math.max(obtenerFE(subAr.hijoIzquierdo), obtenerFE(subAr.hijoDerecho)) + 1;
        }
        return nuevoPadre;
    }

    public void insertar(int d) {
        Nodo nuevo = new Nodo(d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            raiz = insertarAVL(nuevo, raiz);
        }
    }

    // RECORRIDOS
    public void inOrder(Nodo r) {
        if (r != null) {
            inOrder(r.hijoIzquierdo);
            System.out.print(r.dato + ", ");
            inOrder(r.hijoDerecho);
        }
    }

    public void preOrder(Nodo r) {
        if (r != null) {
            System.out.print(r.dato + ", ");
            preOrder(r.hijoIzquierdo);
            preOrder(r.hijoDerecho);
        }
    }

    public void postOrder(Nodo r) {
        if (r != null) {
            postOrder(r.hijoIzquierdo);
            postOrder(r.hijoDerecho);
            System.out.print(r.dato + ", ");
        }
    }

}
