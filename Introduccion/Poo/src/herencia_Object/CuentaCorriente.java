package herencia_Object;

public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void extraer(double importe) {
        super.extraer(importe);
    }

    @Override
    public void depositar(double importe) {
        super.depositar(importe);
    }
    public void extraer(){
        saldo = saldo - descubierto;
    }
}
