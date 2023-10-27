package Scanner;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        int edad;
        char n;
        char a;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        n = nombre.charAt(0);
        System.out.println("Ingrese su apellido: ");
        apellido = scanner.nextLine();
        a = apellido.charAt(0);
        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();
        System.out.println("Usted es " + n + ". "+a+". "+"de "+edad+" años");
    }
}
