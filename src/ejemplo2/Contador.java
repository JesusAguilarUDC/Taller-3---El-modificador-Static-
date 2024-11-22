package ejemplo2;

public class Contador {
    static int contadorGlobal = 0; // Atributo estático
    public Contador() {
        contadorGlobal++; // Incrementa el contador global cada vez que se crea un objeto
    }
    public static void mostrarContador() {
        System.out.println("Contador global: " + contadorGlobal);
    }
}
