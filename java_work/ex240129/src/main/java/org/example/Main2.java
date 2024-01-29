package org.example;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        ArrayList<Apple> list = new ArrayList<>();


//        list.add(10);
//        list.add("String");

        list.add(new Apple("사과"));

        System.out.println(list);


    }
}
