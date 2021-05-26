package com.eplacebo.javacore.chapter11;

public class CurrentThread {
    public static void main(String[] args) {
        Thread z = Thread.currentThread();
        System.out.println("Текущий поток исполнения: " + z);

        z.setName("Мой поток исполнения");
        System.out.println("После изменения имени потока: " + z);
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
