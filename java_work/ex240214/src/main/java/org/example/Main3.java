package org.example;

import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);

        list.forEach( integer -> System.out.println(integer));
        System.out.println();
        
        // system 클래스의 out메서드 참조
        list.forEach(System.out::println);

    }
}
