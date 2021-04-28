package com.eplacebo.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[10];
        System.out.println("Введите строки текста.");
        System.out.println("Введите 'стоп' для завершения.");
        for (int i = 0; i < 10; i++) {
            str[i] = br.readLine();
            if (str[i].equals("стоп")) break;
        }
        System.out.println("\nСодержимое вашего файла:");
        for (int i = 0; i < 10; i++) {
            if (str[i].equals("стоп")) break;
            System.out.println(str[i]);
        }
    }
}
