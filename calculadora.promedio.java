import java.util.Scanner;
public class CalculadorPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Ingresar y analizar calificaciones");
            System.out.println("2. Mostrar estadísticas de calificaciones");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.print("Ingrese la cantidad de alumnos: ");
                int cantidadAlumnos = scanner.nextInt();
                double sumaGeneral = 0;
                for (int alumno = 1; alumno <= cantidadAlumnos; alumno++) {
                    double sumaNotasAlumno = 0;
                    System.out.println("Alumno " + alumno);
                    for (int notaNum = 1; notaNum <= 3; notaNum++) {
                        double nota;
                        do {
                            System.out.print("Ingrese la nota " + notaNum + " (entre 0 y 10): ");
                            nota = scanner.nextDouble();
                            if (nota < 0 || nota > 10) {
                                System.out.println("Nota inválida. Intente nuevamente.");
                            }
                        } while (nota < 0 || nota > 10);
                        sumaNotasAlumno += nota;
                    }
                    double promedioAlumno = sumaNotasAlumno / 3;
                    System.out.println("Promedio del alumno " + alumno + ": " + promedioAlumno);
                    sumaGeneral += sumaNotasAlumno;
                }
                double promedioGeneral = sumaGeneral / (cantidadAlumnos * 3);
                System.out.println("Promedio general de todas las notas: " + promedioGeneral);
            } else if (opcion == 2) {
                System.out.println("Funcionalidad para mostrar estadísticas aún no implementada.");
            } else if (opcion == 3) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 3);
        scanner.close();
    }
}