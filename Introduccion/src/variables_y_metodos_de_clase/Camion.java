package variables_y_metodos_de_clase;

public class Camion {
    private String marca;
    private String patente;
    static private double valorCombustible;

    public Camion(String marca, String patente){
        this.marca = marca;
        this.patente = patente;
    }

    public double gastoCombustible(int litros){
        return litros*Camion.valorCombustible;
    }

    static public void cambiarPrecioCombustible(double precio){
        Camion.valorCombustible = precio;
    }
}
