package ListasClientes;

import java.util.Objects;

public class Cliente {
    //cédula, nombre y procedencia de los clientes
    private String nombre;
    private long cedula;
    private String procedencia;
    private String registradoPor;

    public Cliente() {

        this.nombre = "N"+(cedula);
        this.procedencia = "P"+((int)(Math.random()*5+1));
        this.registradoPor="R"+((int)(Math.random()*3+1));
        cedula++;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.cedula=((long)(Math.random()*10+1));
        this.procedencia = "P"+((int)(Math.random()*4+1));
        this.registradoPor="R"+((int)(Math.random()*3+1));
    }

    public String getRegistradoPor() {
        return registradoPor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                ", procedencia='" + procedencia + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean salida = false;
        if(o instanceof Cliente){
            salida=(this.cedula==((Cliente) o).getCedula());
        }
        return salida;
    }


}
