package notaspublicas;

import java.util.Scanner;

public class calificacionesnotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación del estudiante: ");
        double calificacion = scanner.nextDouble();

        if (calificacion >= 0 && calificacion < 4) {
            System.out.println("La calificación es desaprobada");
        } else if (calificacion >= 4 && calificacion < 7) {
            System.out.println("La calificación es aprobada");
        } else if (calificacion >= 7) {
            System.out.println("La calificación es exelente");
        } 
          else {
            System.out.println("No ingreso calificacion valida");
        }

        scanner.close();
    }
}