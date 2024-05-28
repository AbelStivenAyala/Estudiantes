import java.util.ArrayList;

class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String numeroEstudiante;

    public Estudiante(String nombre, String apellido, int edad, String numeroEstudiante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroEstudiante = numeroEstudiante;
    }

    public String getNumeroEstudiante() {
        return numeroEstudiante;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Número de Estudiante: " + numeroEstudiante;
    }
}