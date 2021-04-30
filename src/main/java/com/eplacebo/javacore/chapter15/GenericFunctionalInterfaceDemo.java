package com.eplacebo.javacore.chapter15;

interface SomeFunc<T> {
    T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {

        SomeFunc<String> revers = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);

            }
            return result;
        };

        System.out.println("Лямбда обращается на " + revers.func("Лямбда"));

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Факториал 6 = " + factorial.func(6));
    }
}
