public class Main {
    public static void main(String[] args) {
        Gestion gestion = new Gestion();

      
        gestion.agregarEstudiante(new Estudiante("Abel", "Pérez", 20, "1152"));
        gestion.agregarEstudiante(new Estudiante("keila", "Quintero", 22, "1143"));

        System.out.println("Listado de estudiantes:");
        gestion.listarEstudiantes();

        System.out.println("\nBuscar estudiante");
        gestion.buscarEstudiantePorNumero("1152");

        System.out.println("\nBuscar estudiante:");
        gestion.buscarEstudiantePorNumero("1123");
    }
}
