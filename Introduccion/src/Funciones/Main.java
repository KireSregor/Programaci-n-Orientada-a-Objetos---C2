package Funciones;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean divisible;
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer numero:");
        num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo numero:");
        num2 = scanner.nextInt();

        divisible = esDivisible(num1,num2);
        System.out.println("El numero " +num1+ " es divisible por "+num2+"?: "+divisible);
    }

    public static boolean esDivisible(int n, int divisor) {
        if(n % divisor == 0){
            return true;
        }else{
            return false;
        }
    }
}
