package abstract_class;

public abstract class Cuenta {
    private int clienteId;


    public Cuenta(int clienteId){
        this.clienteId = clienteId;
    }

    public void depositar(){

    }
    public abstract void extraerEfectivo();

    public void informeSaldo(){
        System.out.println("saldo es: ");
    }
}
