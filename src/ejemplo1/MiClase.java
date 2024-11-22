package ejemplo1;

public class MiClase {
    static int contador = 0; // Atributo estático
    static void incrementarContador() { // Método estático
        contador++;

        MiClase.incrementarContador();
    }
}
