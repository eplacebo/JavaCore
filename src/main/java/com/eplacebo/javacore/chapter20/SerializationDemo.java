package com.eplacebo.javacore.chapter20;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {

        try (ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClassS object1 = new MyClassS("Hello", -7, 2.7e10, 22.2);
            System.out.println("object1: " + object1);
            objOStrm.writeObject(object1);

        } catch (IOException e) {
            System.out.println("Исключение при сериализации: " + e);
        }

        try (ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClassS object2 = (MyClassS) objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Исключение при десериализации: " + e);
            System.exit(0);
        }
    }
}

class MyClassS implements Serializable {
    String s;
    int i;
    double d;
    transient double dd;

    public MyClassS(String s, int i, double d, double dd) {
        this.s = s;
        this.i = i;
        this.d = d;
        this.dd = dd;
    }

    @Override
    public String toString() {
        return "s=" + s + "; i=" + i + "; d=" + d + "(transient:" + dd + ")";
    }
}




