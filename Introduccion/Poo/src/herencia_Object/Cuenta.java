package herencia_Object;

import java.util.Objects;

public class Cuenta {
    private String numero;
    protected double saldo;

    public Cuenta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public void extraer(double importe){
        this.saldo = this.saldo - importe;
    }
    public void depositar(double importe){
        this.saldo = this.saldo + importe;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        else {
            Cuenta cuenta = (Cuenta) o;
            return this.getNumero().equals(cuenta.getNumero());
        }
        }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero(), getSaldo());
    }
}
