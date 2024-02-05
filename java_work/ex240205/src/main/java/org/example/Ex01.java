package org.example;

import java.util.*;

// 문자열을 정렬할 수 있는 LIST를 만들어보자
public class Ex01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Weapon");
        list = new ArrayList<>(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
