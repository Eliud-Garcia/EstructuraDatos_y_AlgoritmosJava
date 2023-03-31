package ListaDoblementeEnlazada;

public class Producto {
    private int codigo;
    private String nombre;
    private double precioUnitario;
    private int cantidadBodega;
    private int cantidadVendida;

    public Producto(int codigo, String nombre, double precioUnitario, int cantidadBodega) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadBodega = cantidadBodega;
        this.cantidadVendida = 0;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", cantidadBodega=" + cantidadBodega + ", cantidadVendida=" + cantidadVendida + '}';
    }

    public boolean vender() {
        if (this.getCantidadBodega() > 0) {
            this.cantidadBodega--;
            this.cantidadVendida++;
            return true;
        }
        return false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }
}
