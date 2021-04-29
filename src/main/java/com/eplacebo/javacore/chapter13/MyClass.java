package com.eplacebo.javacore.chapter13;

public class MyClass {
    int a, b;

    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    MyClass(int i) {
        this(i, i);
    }

    MyClass() {
        this(0);
    }

    public static void main(String[] args) {

        MyClass mc = new MyClass(4, 5);
        MyClass mc2 = new MyClass(4);
        MyClass mc3 = new MyClass(0);
        System.out.println(mc.b);
        System.out.println(mc2.b);
        System.out.println(mc3.b);
    }
}
