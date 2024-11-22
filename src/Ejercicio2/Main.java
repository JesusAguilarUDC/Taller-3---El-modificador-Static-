package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero = ");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero = ");
        double num2 = scanner.nextDouble();


        System.out.println("Suma = " + Matematicas.sumar(num1, num2));
        System.out.println("Resta = " + Matematicas.restar(num1, num2));
        System.out.println("Multiplicación = " + Matematicas.multiplicar(num1, num2));
        System.out.println("División = " + Matematicas.dividir(num1, num2));

    }
}
