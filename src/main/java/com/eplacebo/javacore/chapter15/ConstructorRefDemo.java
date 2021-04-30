package com.eplacebo.javacore.chapter15;

interface MyFuncC {
    MyClassC func(int n);
}

class MyClassC {
    private int val;

    MyClassC() {
        val = 0;
    }

    MyClassC(int v) {
        val = v;
    }

    int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFuncC MyClassCons = MyClassC::new;

        MyClassC mc = MyClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
