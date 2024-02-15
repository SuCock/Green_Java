package org.example;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main9 {
    public static void main(String[] args) {
        Stream.of(11, 55, 33, 22, 99)
                // 오름차순
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        Stream.of(11, 55, 33, 22, 99)
                // 내림차순으로 바꿀려면 계산을 추가하면된다.
                .sorted((o1, o2) -> o2 - o1)
                .forEach(System.out::println);

        System.out.println();
        IntStream.of(1, 3, 5, 7, 9)
                // 최종연산이 없음으로 그대로 나온다
                .peek(System.out::println);

        System.out.println();
        IntStream.of(1, 3, 5 ,7, 9)
                .peek(System.out::println)
                // sum이 최종연산
                .sum();

        System.out.println();
        IntStream.of(1, 3, 5, 7, 9)
                // stream을 쓰면 메모리를 적게쓴다
                .peek(System.out::println)
                .forEach(System.out::println);
    }
}
