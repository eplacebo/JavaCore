package com.eplacebo.javacore.chapter15;

interface NumericFunc {
    int func(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {


        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("Факториал числа 5 равен " + factorial.func(5));
        System.out.println("Факториал числа 10 равен " + factorial.func(10));
    }
}

