package solicitarobre;

import java.util.Scanner;

public class Solicitarobre {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hola, ¿cuál es tu nombre? ");
        String nombre = scanner.nextLine();

        System.out.print("¿Cuál es tu edad? ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("¡Bienvenido, " + nombre + "! Eres mayor de edad.");
        } else {
            System.out.println("Lo siento, " + nombre + ". Debes ser mayor de edad para continuar.");
        }

        scanner.close();
    }
}