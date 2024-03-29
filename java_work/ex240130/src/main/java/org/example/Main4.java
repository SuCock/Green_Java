package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Toy");
        list.add("Robot");
        list.add("Car");

        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        list.remove(0);
        System.out.println();
        
        // list를 a에 담아서 출력해라
        for(String a : list){
            System.out.println(a);
        }

        System.out.println(list);
        System.out.println();

        Stream.of(list).forEach(item -> System.out.println(item));
        Stream.of(list).forEach(System.out::println);
    }
}
