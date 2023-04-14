package Listas.ListaCirular;

public class Estudiante {

    private int codigo;
    private String nombre;
    private String programa;
    private int edad;
    private float promedio;

    public Estudiante() {
    }
    public Estudiante(int codigo, String nombre, String programa, int edad, float promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.programa = programa;
        this.edad = edad;
        this.promedio = promedio;
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
    public String getPrograma() {
        return programa;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public float getPromedio() {
        return promedio;
    }
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + ", programa=" + programa + ", edad=" + edad + ", promedio=" + promedio + '}';
    }


}
