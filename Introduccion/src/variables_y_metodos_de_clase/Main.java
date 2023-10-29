package variables_y_metodos_de_clase;

public class Main {
    public static void main(String[] args) {

        Camion miCamion = new Camion("Ford","ABCD");

        Camion.cambiarPrecioCombustible(98.50);
        System.out.println("Gasto "+miCamion.gastoCombustible(40));

    }
}
