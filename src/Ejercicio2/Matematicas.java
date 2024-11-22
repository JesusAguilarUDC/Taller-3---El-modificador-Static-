package Ejercicio2;

import java.util.Scanner;

public class Matematicas {
    public static double sumar(double a, double b){
        return a + b;
    }

    public static double restar(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        if (b == 0){
            System.out.println("error, no se permite dividir por 0");
        }

        return a / b;
    }
}
