package Ejercicio1;

public class Coche {
    private String marca;
    private String modelo;

    private static int contadorCoches = 0;

    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }


    public static int MostrarContadorCoches(){
        return contadorCoches;
    }
}