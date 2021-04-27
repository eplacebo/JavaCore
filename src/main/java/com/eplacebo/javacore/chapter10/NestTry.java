package com.eplacebo.javacore.chapter10;

// Если во вложенном операторе try нет catch, то проверяется из внешнего catch

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 42 / a;
            System.out.println("a= " + a);
            try {
                if (a == 1) a = a / (a - a);
                if (a == 2) {
                    int c[] = {1};
                    c[1] = 77;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс за пределами массива " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        }
    }
}
