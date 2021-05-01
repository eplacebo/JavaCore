package com.eplacebo.javacore.chapter15;

interface MyFuncGen2<R, T> {
    R func(T n);
}

class MyClassG<T> {
    private T val;

    MyClassG(T v) {
        val = v;
    }

    MyClassG() {
        val = null;
    }

    T getVal() {
        return val;
    }

}

class MyClassG2 {
    String str;

    MyClassG2(String s) {
        str = s;
    }

    MyClassG2() {
        str = "";
    }

    String getVal() {
        return str;
    }

}


public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFuncGen2<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFuncGen2<MyClassG<Double>, Double> myClassCons = MyClassG<Double>::new;
        MyClassG<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        MyFuncGen2<MyClassG2, String> MyClassCons2 = MyClassG2::new;
        MyClassG2 mc2 = myClassFactory(MyClassCons2, "Лямбда");
        System.out.println("Значение str в объекте mc2 равно " + mc2.getVal());

    }
}
