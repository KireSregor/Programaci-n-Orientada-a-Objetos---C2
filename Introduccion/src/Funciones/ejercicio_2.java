package Funciones;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[3];
        Integer maximo;
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.println("Ingresa un numero:");
            numbers[i] = scanner.nextInt();
        }
        maximo = maximoEntreTresNumeros(numbers[0],numbers[1],numbers[2]);
        System.out.println("El numero maximo es: " + maximo);

    }

    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC) {

        Integer maximo = unNumeroA;

        if(unNumeroB > maximo){
            maximo = unNumeroB;
        }
        if(unNumeroC > maximo){
            maximo = unNumeroC;
        }
        return maximo;

    }
}
