package org.example;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        list = new ArrayList<>(list);

        Collections.reverse(list);
        System.out.println(list);

        Consumer<List<Integer>> consumer = lst -> Collections.reverse(lst);
        consumer.accept(list);

        // collection의 static메서드가 들어있다(lst를 안쓰고 싶어서 줄이기)
        Consumer<List<Integer>> consumer1 = Collections::reverse;
        consumer1.accept(list);

        System.out.println(list);
    }
}