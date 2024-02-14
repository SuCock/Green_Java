package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class JustSort{
    public void sort(List<?> list){
        Collections.reverse(list);
    }
}
public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        list = new ArrayList<>(list);

        JustSort js = new JustSort();
        // 람다는 중괄호를 넣으면 한줄 이상쓸 수 있지만
//        Consumer<List<Integer>> listConsumer = lst -> js.sort(lst);
        // 메서드 참조는 한줄밖에 쓰지 못한다
        Consumer<List<Integer>> listConsumer = js::sort;

        listConsumer.accept(list);
        System.out.println(list);
    }
}
