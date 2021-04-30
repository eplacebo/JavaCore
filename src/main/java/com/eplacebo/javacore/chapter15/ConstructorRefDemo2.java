package com.eplacebo.javacore.chapter15;

interface MyFuncC2<T> {
    MyClassC2<T> func(T n);
}

class MyClassC2<T> {
    private T val;

    MyClassC2() {
        val = null;
    }

    MyClassC2(T v) {
        val = v;
    }

    T getVal() {
        return val;
    }
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFuncC2<Integer> MyClassCons = MyClassC2<Integer>::new;

        MyClassC2<Integer> mc = MyClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}