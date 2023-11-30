package abstract_class;

import javax.naming.ldap.spi.LdapDnsProvider;

public class Cliente {

    private int id;
    private String apellido;
    private double DNI;
    private double CUIT;

    public Cliente(int id, String apellido, double DNI, double CUIT){
        this.id = id;
        this.apellido = apellido;
        this.DNI = DNI;
        this.CUIT = CUIT;
    }

}
