package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

// 메서드가 하나만 존재한다
@FunctionalInterface
interface AA{
    int gen();
    // 메서드가 하나만 존재해야함으로 두개있으면 오류가 뜬다.
//    int test();
}

public class Main3 {
    public static void main(String[] args) {
        AA aa = () -> {
            return new Random().nextInt(50);
        };
        int a = aa.gen();
        System.out.println(a);

        List<Integer> list = Arrays.asList(a, aa.gen(), aa.gen());
        System.out.println(list);
    }
}
