package com.eplacebo.javacore.chapter15;

interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;

        System.out.println("Фиксированное значение: " + myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println("Рандом: " + (int) myNum.getValue());
        System.out.println("Еще рандом: " + myNum.getValue());

        // myNum = () -> "123.03"; - ОШИБКА! Лямбда-выражение должно быть совместимо с абстрактным методом, определяемым в функц. интерфейсе.
    }
}
