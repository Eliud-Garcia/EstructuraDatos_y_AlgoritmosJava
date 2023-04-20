package EjerciciciosCombinados;

public class Pedido {
    private String tienda;
    private String lavadoras;

    public Pedido(String tienda, String lavadoras) {
        this.tienda = tienda;
        this.lavadoras = lavadoras;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public String getLavadoras() {
        return lavadoras;
    }

    public void setLavadoras(String lavadoras) {
        this.lavadoras = lavadoras;
    }

    @Override
    public String toString() {
        return "Pedido{" + "tienda=" + tienda + ", lavadoras=\n" + lavadoras + '}';
    }

}
