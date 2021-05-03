package com.eplacebo.javacore.chapter20;

import java.io.*;


//Javaw не связан с окном консоли

class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        con = System.console();

        if (con == null) return;

        System.out.println("asdasd");
        str = con.readLine("Введите строку: ");
        con.printf("Выведенная строка: %s\n", str);

    }
}
