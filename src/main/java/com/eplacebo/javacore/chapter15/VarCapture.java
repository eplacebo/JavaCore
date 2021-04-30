package com.eplacebo.javacore.chapter15;

interface MyFunc {
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;

        MyFunc myLambda = n -> {
            int v = num + n;
            // num++ - не допускается из-за попытки изменить значение переменной num.
            return v;
        };
        // num=9; -запрещается, нарушается действительно завершенное состояние переменной num
        //изменение переменной num в самом блоке лямбды и за его пределами приведет к ошибке
    }
}
