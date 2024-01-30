package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30); // 변경불가

        System.out.println(list);
        System.out.println();

        Iterator<Integer> itr = list.iterator(); // 반복자
        while (itr.hasNext()) {
            int temp = itr.next();
            System.out.println(temp);
        }

        List<Integer> list2 = new ArrayList<>(list); // 변경하고 싶으면 새로 선언
        list2.add(50);
        System.out.println(list2);

    }
}
