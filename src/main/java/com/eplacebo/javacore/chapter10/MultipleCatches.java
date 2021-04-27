package com.eplacebo.javacore.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[2] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива" + e);
        }
        System.out.println("После блока операторов try/catch. При срабатывани одного из операторов catch, другие не проверяются.");
    }
}
