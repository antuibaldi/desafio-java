import java.util.Scanner; 

public class SwitchEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 3: ");
        int numero = 0;

        do {
            System.out.print("---MENU--- ");
            System.out.println("1. Opción 1 Registrar persona");
            System.out.println("2. Opción 2 Dar mensaje de bienvenida");
            System.out.println("3. Opción 3 Salir");
            System.out.print("Seleccione una opción: ");
            numero = scanner.nextInt();
        } while (numero == 1 || numero == 2 || numero == 3);
 {
        switch (numero) {
            case 1:
                System.out.println("Usted ingresó uno. Ingresar persona");
                break;
            case 2:
                System.out.println("Usted ingresó dos.");
                break;
            case 3:
                System.out.println("Usted ingresó tres. Salir");
                break;
            default:
                System.out.println("Número fuera de rango.");
                break;
        }
    }
}   
}