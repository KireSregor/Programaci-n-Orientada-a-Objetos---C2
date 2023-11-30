package realcion_entre_clases;

public class Main {
    public static void main(String[] args) {
        Chofer chofer, chofer1;
        Auto auto = new Auto("abd","FORD","12S");


        chofer = new Chofer("Benjamin", "Franklin", new Auto("123","Tesla","F46"));

        System.out.println("Patente de auto asignado: " + chofer.verPatente());

        chofer1 = new Chofer("Pedro","Pomalia", auto);
     

    }
}
