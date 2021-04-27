package com.eplacebo.javacore.chapter10;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random rndm = new Random();

        for (int i = 0; i < 100; i++) {
            try {
                b = rndm.nextInt();
                c = rndm.nextInt();
                ;
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println(i + " = " + "Exeption > RuntimeException > ArithmeticException(деление на ноль)");
                a = 0;
            }
            System.out.println(i + " = " + "a: " + a);
        }
    }
}
