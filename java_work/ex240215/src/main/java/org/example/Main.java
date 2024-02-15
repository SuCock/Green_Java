package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============array=======================");
        int[] ar = {1, 2, 3, 4, 5};
        IntStream is = Arrays.stream(ar);
        is.forEach(s -> System.out.println(s));

//        Arrays.stream(ar).forEach(value -> System.out.println(value));

        System.out.println();

        System.out.println("==============list========================");
        List<Integer> list = Arrays.asList(11, 22, 33, 44, 55);
        Stream<Integer> is2 = list.stream();
        is2.forEach(System.out::println);

//        list.stream().forEach(System.out::println);
    }
}