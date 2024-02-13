package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(11, 22, 33, 44, 55);
        list1 = new ArrayList<>(list1);

        List<String> list2 = Arrays.asList("aa", "ab", "ac", "ad", "ae");
        list2 = new ArrayList<>(list2);
        
        // predicate를 사용해서 boolean값을 리턴하다 -> removeIf에 사용
        Predicate<Integer> predicate = (item) -> {return item < 33;};
        // {}가 없으면 return 생략가능하다
        list1.removeIf(integer -> integer < 33);
        System.out.println(list1);

        list2.removeIf(s -> !s.equals("aa"));
        System.out.println(list2);
    }
}
