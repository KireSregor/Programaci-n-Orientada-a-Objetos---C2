package StringInteger;

public class ejercicio_2 {
    public static void main(String[] args) {
        Integer number_1 = 5;
        Integer number_2 = 10;
        int compare;

//        if(number_1 > number_2){
//            System.out.println("El mayor es:" + number_1);
//        }else{
//            if(number_1 == number_2){
//                System.out.println("Son iguales");
//            }else{
//                System.out.println("El mayor es:" + number_2);
//            }
//        }

        compare = number_1.compareTo(number_2);

        switch (compare){
            case 0:
                System.out.println("Los numeros son iguales");
                break;
            case 1:
                System.out.println("El numero mayor es: " + number_1);
                break;
            case -1:
                System.out.println("El numero mayor es: " + number_2);
                break;
        }

    }
}
