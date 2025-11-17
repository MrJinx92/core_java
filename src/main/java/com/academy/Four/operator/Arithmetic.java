package com.academy.Four.operator;
/**
 * Aritmeticki operatori:
 * 1. + Additive operator
 * 2. - Subtraction operator
 * 3. * Multiplication operator
 * 4. / Division operator
 * 4. % Remainder -> ostatak od deljenja
 */
import java.io.InputStream;
import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        System.out.println("Dobro dosli u nas sistem");
        System.out.println("Unesite prvi broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite drugi broj");
        int number2 = new Scanner(System.in).nextInt();

        int suma = number1 + number2;
        System.out.println("suma =" + suma);
    }
}
