package instancia;

public class Articulo {
    private String descripcion;
    private double precioVenta;
    private int stock;

    public Articulo(String descripcion, int cantidad, double precio){
        this.descripcion = descripcion;
        precioVenta = precio;
        stock = cantidad;
    }

    public boolean hayStock(){
        return stock>0;
    }
    public double consultarPrecio(){
        return precioVenta;
    }
}
