package Funciones;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();
        esPrimo(numero);
    }

    public static void esPrimo(int number) {
        int count=0;
        for(int i=0;i<number;i++){
            boolean bool = Main.esDivisible(number,i+1);
            if(bool){
                count++;
            }
        }

        if (count == 2){
            System.out.println(number+" ES un numero primo!");
        }else{
            System.out.println(number + " NO es un numero primo!");
        }

    }
}
