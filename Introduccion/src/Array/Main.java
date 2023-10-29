package Array;

public class Main {
    public static void main(String[] args) {

        String[] nombres = new String[5];

        nombres[0] = "Cero";
        nombres[1] = "Uno";
        nombres[3] = "Tres";

//        for(int i=0; i < nombres.length; i++){
//            System.out.println(nombres[i]);
//        }


//        int i=0;
//        while(i<nombres.length){
//            System.out.println(nombres[i]);
//            i++;
//        }
//
        for(String nombre : nombres){
            System.out.println(nombre);
        }

    }
}
