package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main4 {
    public static void main(String[] args) {
        Runnable run1 = () -> {
//        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "ㅋㅋㅋ A 쓰레드");
//        }
        };

        Runnable run2 = () -> {
//        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "ㅋㅋㅋ B 쓰레드" );
//        }
        };

        ExecutorService es = Executors.newFixedThreadPool(2); // 동시에 진행하는 쓰레드의 갯수
        es.submit(run1);
        es.submit(run2);
        es.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "ㅋㅋㅋ C 쓰레드");
        });

        es.shutdown();
    }

}
