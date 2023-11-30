package class_interface;

public class Main {
    public static void main(String[] args) {
        // los parametros se agregan solo cuando esta el constructor
        Persona p1 = new Persona(13);
        Persona p2 = new Persona(18);

        int valor;

        valor = p1.compareTo(p2);
        System.out.println(valor);

    }
}
