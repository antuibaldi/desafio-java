import java.util.Scanner;

public class programa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese su ciudad: ");
        String ciudad = scanner.next();

        scanner.close() ;




        System.out.println( "---Registro de Persona---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad  );
        System.out.println("Localidad: " + ciudad );
    }

}
