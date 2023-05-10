package Arboles.arbolBinario;


public class ArbolBinario {

    private Nodo raiz;

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(Estudiante estudiante) {
        Nodo nuevo = new Nodo(estudiante);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo auxiliar = raiz;
            Nodo padre;
            while (true) {
                padre = auxiliar;
                if (estudiante.getNota() < auxiliar.getEstudiante().getNota()) {
                    auxiliar = auxiliar.getIzq();
                    if (auxiliar == null) {
                        padre.setIzq(nuevo);
                        return;
                    }
                } else {
                    auxiliar = auxiliar.getDer();
                    if (auxiliar == null) {
                        padre.setDer(nuevo);
                        return;
                    }
                }
                if (estudiante.getCodigo() == auxiliar.getEstudiante().getCodigo()) {
                    return;
                }
            }
        }
    }

    public boolean Vacio() {
        return raiz == null;
    }

    public String inOrden(Nodo raiz) {
        if (raiz == null) {
            return "";
        } else {
            return inOrden(raiz.getIzq()) + " " + raiz.getEstudiante() + " " + inOrden(raiz.getDer());
        }
    }

    public String preOrden(Nodo raiz) {
        if (raiz == null) {
            return "";
        } else {

        }
        return raiz.getEstudiante() + " " + preOrden(raiz.getIzq()) + " " + preOrden(raiz.getDer());
    }

    public String postOrden(Nodo raiz) {
        if (raiz == null) {
            return "";
        } else {
            return postOrden(raiz.getIzq()) + " " + postOrden(raiz.getDer()) + " " + raiz.getEstudiante();
        }
    }

    public void eliminarReprobados(Nodo r) {
        if (r != null) {
            eliminarReprobados(r.getIzq());
            if (r.getEstudiante().getNota() < 3.0) {
                eliminar(r.getEstudiante());
            }
            eliminarReprobados(r.getDer());
        }
    }

    public int numeroEstudiante(Nodo raiz) {
        if (raiz == null) {
            return 0;
        } else {
            return numeroEstudiante(raiz.getIzq()) + 1 + numeroEstudiante(raiz.getDer());
        }
    }

    public Nodo buscar(Estudiante estudiante) {
        Nodo aux = raiz;
        while (aux.getEstudiante().getCodigo() != estudiante.getCodigo()) {
            if (estudiante.getCodigo() > aux.getEstudiante().getCodigo()) {
                aux = aux.getDer();
            } else {
                aux = aux.getIzq();
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }

    public boolean eliminar(Estudiante estudiante) {
        Nodo aux = raiz;
        Nodo padre = raiz;
        boolean hijoizquierdo = true;
        while (aux.getEstudiante().getNota() != estudiante.getNota()) {
            padre = aux;
            if (estudiante.getNota() > aux.getEstudiante().getNota()) {
                aux = aux.getDer();
                hijoizquierdo = false;
            } else {
                aux = aux.getIzq();
                hijoizquierdo = true;
            }
            if (aux == null) {
                return false;
            }
        }
        if (aux.getIzq() == null && aux.getDer() == null) {
            if (aux == raiz) {
                raiz = null;
            } else if (hijoizquierdo) {
                padre.setIzq(null);
            } else {
                padre.setDer(null);
            }
        } else if (aux.getDer() == null) {
            if (aux == raiz) {
                raiz = aux.getIzq();
            } else if (hijoizquierdo) {
                padre.setIzq(aux.getIzq());
            } else {
                padre.setDer(aux.getIzq());
            }
        } else if (aux.getIzq() == null) {
            if (aux == raiz) {
                raiz = aux.getDer();
            } else if (hijoizquierdo) {
                padre.setIzq(aux.getDer());
            } else {
                padre.setDer(aux.getDer());
            }
        } else {
            Nodo reemplazo = obtenerReemplazo(aux);
            if (raiz == aux) {
                raiz = reemplazo;
            } else if (hijoizquierdo) {
                padre.setIzq(reemplazo);
            } else {
                padre.setDer(reemplazo);
            }
            reemplazo.setIzq(aux.getIzq());
        }
        return true;
    }

    public Nodo obtenerReemplazo(Nodo nodoReemplazo) {
        Nodo reemplazoPadre = nodoReemplazo;
        Nodo reemplazo = nodoReemplazo;
        Nodo aux = nodoReemplazo.getDer();
        while (aux != null) {
            reemplazoPadre = reemplazo;
            reemplazo = aux;
            aux = aux.getIzq();
        }
        if (reemplazo != nodoReemplazo.getDer()) {
            reemplazoPadre.setIzq(reemplazo.getDer());
            reemplazo.setDer(nodoReemplazo.getDer());
        }
        return reemplazo;
    }

}
