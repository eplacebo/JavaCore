package com.eplacebo.javacore.chapter10;

// Соблюдение иерархии исключений от младшего к старшему.
// Если перехватывается сначала общий(Exception), то производный не выполнится т.к. включен в общий.

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception");
/*        } catch (ArithmeticException e) {
            System.out.println("Этот код не достижим, т.к. перехвачем общий класс. ");

*/

        }
    }
}
