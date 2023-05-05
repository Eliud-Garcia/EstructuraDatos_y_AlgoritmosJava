package EjerciciciosCombinados.ejercicio1;

public class Tienda {
    private String nombre;
    private int solicitud;

    public Tienda(String nombre, int solicitud) {
        this.nombre = nombre;
        this.solicitud = solicitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(int solicitud) {
        this.solicitud = solicitud;
    }

    @Override
    public String toString() {
        return "Tienda{" + "nombre=" + nombre + ", solicitud=" + solicitud + '}';
    }


}
