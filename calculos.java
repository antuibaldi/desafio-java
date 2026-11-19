import java.util.Scanner;

public class programa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Ingrese el primer número: ");

        int numero1 = scanner.nextInt();



        System.out.print("Ingrese el segundo número: ");

        int numero2 = scanner.nextInt();



        int suma = numero1 + numero2;

        int resta = numero1 - numero2;

        int multiplicacion = numero1 * numero2;



        System.out.println("\n-- RESULTADOS --");

        System.out.println("El número 1 es: " + numero1);

        System.out.println("El número 2 es: " + numero2);

        System.out.println("La suma es: " + suma);

        System.out.println("La resta es: " + resta);

        System.out.println("La multiplicación es: " + multiplicacion);



        if (numero2 != 0) {

            double division = (double) numero1 / numero2;

            int resto = numero1 % numero2;



            System.out.println("La división es: " + division);

            System.out.println("El resto es: " + resto);



            if (resto == 0) {

                System.out.println("El primer número es divisible por el segundo.");

            } else {

                System.out.println("El primer número no es divisible por el segundo.");

            }

        } else {

            System.out.println("No se puede dividir por cero.");

        }



        if (numero1 % 2 == 0) {

            System.out.println(numero1 + " es par.");

        } else {

            System.out.println(numero1 + " es impar.");

        }



        if (numero2 % 2 == 0) {

            System.out.println(numero2 + " es par.");

        } else {

            System.out.println(numero2 + " es impar.");

        }
        double potencia= Math.pow(numero1, numero2);
        System.out.println("El resultado de la potencia es: " + potencia);

        double promedio= suma/2.0;
        System.out.println("El resultado del promedio es: " + promedio);

        int divisionSinDecimal = numero1 / numero2;

        System.out.println("El resultado de la división es: " + divisionSinDecimal);





        scanner.close();

    }

}