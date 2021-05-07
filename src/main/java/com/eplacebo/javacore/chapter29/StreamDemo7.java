package com.eplacebo.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail2 {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail2(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhone2 {
    String name;
    String phonenum;

    NamePhone2(String n, String p) {
        name = n;
        phonenum = p;
    }
}


public class StreamDemo7 {
    public static void main(String[] args) {

        ArrayList<NamePhoneEmail2> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail2("Ларри", "555-5555", "Larry@yandex.ru"));
        myList.add(new NamePhoneEmail2("Джеймс", "555-4444", "James@yandex.ru"));
        myList.add(new NamePhoneEmail2("Мэри", "555-3333", "Mary@yandex.ru"));

        Stream<NamePhone2> nameAndPhone2 = myList.stream().map((a) -> new NamePhone2(a.name, a.phonenum));

        List<NamePhone2> npList = nameAndPhone2.collect(Collectors.toList());

        System.out.println("Имена и номера телефонов в списке типа List:");
        for (NamePhone2 e : npList)
            System.out.println(e.name + ": " + e.phonenum);

        nameAndPhone2 = myList.stream().map((a) -> new NamePhone2(a.name, a.phonenum));

        Set<NamePhone2> npSet = nameAndPhone2.collect(Collectors.toSet());

        System.out.println("\nИмена и номера телефонов в множестве типа Set:");
        for (NamePhone2 e : npSet) System.out.println(e.name + ": " + e.phonenum);
    }
}

