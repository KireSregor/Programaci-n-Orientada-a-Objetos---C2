package Funciones;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        String text1, text2;
        boolean compare;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer texto: ");
        text1 = scanner.nextLine();
        System.out.println("Ingrese el segundo texto: ");
        text2 = scanner.nextLine();
        compare = cadenasDeTextoDistintas(text1,text2);
        System.out.println("Los textos son iguales?: " +  compare);


    }

    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) {

        if(unTextoA.equals(unTextoB)){
            return true;
        }else{
            return false;
        }

    }
}
