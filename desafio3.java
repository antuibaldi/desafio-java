public class desafio3 {

 public static void main(String[] args) {

 // Calculadora 

 //Habilito Scanner - Antes de usar las var tengo que habilitarlo porque se definen y asignan valor al mismo tiempo

 Scanner miScanner = new Scanner(System.in);

 

 System.out.println("===== Calculadora Desafío 3 =====");

 System.out.println();

 int valor1 = 0;

 int valor2 = 0;

 

 boolean esValorValido = false;

 

 while (!esValorValido) {

 System.out.println("Ingrese el primer número entero:");

 

 if (miScanner.hasNextInt()) {

 valor1 = miScanner.nextInt(); //Es numero entero, sigo 

 esValorValido = true;

 } else {

 System.out.println("Ingrese un número entero válido.");

 miScanner.next() ;//si no ponia esta lectura quedaba en bucle y no leia el nextint

 } //Cierra el if 

 } //Cierra el while

 System.out.println();

 miScanner.nextLine(); // Lo hago para que capture el enter del next int

 esValorValido = false; 


 while (!esValorValido) {

 System.out.println("Ingrese el segundo número entero:");

 

 if (miScanner.hasNextInt()) {

 valor2 = miScanner.nextInt(); //Es numero entero, sigo 

 esValorValido = true;

 } else {

 System.out.println("Ingrese un número entero válido.");

 miScanner.next() ;//si no ponia esta lectura quedaba en bucle y no leia el nextint

 } //Cierra el if 

 } //Cierra el while

 System.out.println();

 miScanner.nextLine(); // Lo hago para que capture el enter del next int 

 // Salida de valores

 System.out.println(">>>> Resultados calculados <<<<");

 System.out.println();

 int resultado;

 resultado = valor1 + valor2;

 System.out.println("La SUMA de los valores es: " + resultado );

 resultado = valor1 - valor2;

 System.out.println("La RESTA de los valores es: " + resultado );

 resultado = valor1 * valor2;

 System.out.println("La MULTIPLICACIÓN de los valores es: " + resultado );

 resultado = valor1 / valor2;

 System.out.println("La DIVISIÓN de los valores es: " + resultado );

 resultado = valor1 % valor2;

 System.out.println("El RESTO de la división de los valores es: " + resultado );

 System.out.print("¿El valor 1 es divisible por el valor 2?: ");

 if (resultado == 0) {

 System.out.println("SI");

 } else {

 System.out.println("NO");

 }

 //Verificación de si son pares o impares

 resultado = valor1 % 2;

 System.out.print("El valor 1 (" + valor1 + ") es ");

 if (resultado == 0) {

 System.out.println("PAR");

 } else {

 System.out.println("IMPAR");

 }

 resultado = valor2 % 2;

 System.out.print("El valor 2 (" + valor2 + ") es ");

 if (resultado == 0) {

 System.out.println("PAR");

 } else {

 System.out.println("IMPAR");

 }

 }


}