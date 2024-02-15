package org.example;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main10 {
    public static void main(String[] args) {
        System.out.println(
                IntStream.of(1, 3, 5, 7, 9)
                        .sum()
        );

        System.out.println(IntStream.of(1, 3, 5, 7, 9)
                .count()
        );
        
        // 어디에 못 담고 출력만 가능
        IntStream.of(1, 3, 5, 7, 9)
                .average().ifPresent(System.out::println);

        // 어디에 못 담고 출력만 가능
        IntStream.of(1, 3, 5, 7, 9)
                .max().ifPresent(System.out::println);


        // 어디에 못 담고 출력만 가능
        IntStream.of(1, 3, 5, 7, 9)
                .min().ifPresent(System.out::println);
    }
}
