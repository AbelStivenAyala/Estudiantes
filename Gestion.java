import java.util.ArrayList;

class Gestion {
    private ArrayList<Estudiante> estudiantes;

    public Gestion() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados");
        } else {
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }

    public void buscarEstudiantePorNumero(String numeroEstudiante) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNumeroEstudiante().equals(numeroEstudiante)) {
                System.out.println(estudiante);
                return;
            }
        }
        System.out.println("Estudiante no encontrado");
    }
}