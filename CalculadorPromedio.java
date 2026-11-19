import java.util.Scanner;

public class CalculadorPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
    
            System.err.println("---MENU---");
            System.err.println("1. Ingresar notas");
            System.err.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
        } while (opcion == 1 || opcion == 2);

        System.out.println("Saliendo del programa...");
        

        if (opcion == 1) {
            System.out.print("Ingrese la cantidad de notas solo numeros enteros: ");
            int cantidad = scanner.nextInt();
            double suma = 0;

            for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = scanner.nextDouble();
            suma += nota;
        }

        double promedio = suma / cantidad;
        System.out.println("El promedio es: " + promedio);
        if (opcion == 2) {
            System.out.println("Saliendo del programa...");
        }
        
    }
    scanner.close();
    }
} 




    
//NO SE SI ESTA BIEN SE ME PROGRAMO SOLO FIRMA ANTU TUPAC IBALDI