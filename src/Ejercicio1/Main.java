package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Supra");
        Coche coche2 = new Coche("Nissan", "Skyline");
        Coche coche3 = new Coche("Chevrolet", "Onix Turbo Sedán");

        System.out.println("La cantidad de coches creados es de = " + Coche.MostrarContadorCoches());
    }
}
