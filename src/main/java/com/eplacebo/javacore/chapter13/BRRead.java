package com.eplacebo.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы,'q' - для выхода.");
        do {
            c = (char) rdr.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
