package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main3 {
    public static void main(String[] args) {
        // newSingleThreadExecutor를 쓰면 join을 쓰지 않아도 동기화 가능
        // newSingleThreadExecutor -> 풀 안에 하나의 쓰레드만 생성하고 유지하기 때문에 하나가 끝나야지 다름거 실행
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.submit(() -> {
            int n1 = 10;
            int n2 = 20;
            System.out.println(Thread.currentThread().getName() + " 1 " + (n1 + n2));
        });
        es.submit(() -> {
            int n1 = 10;
            int n2 = 20;
            System.out.println(Thread.currentThread().getName() + " 2 " + (n1 + n2));
        });
        es.submit(() -> {
            int n1 = 10;
            int n2 = 20;
            System.out.println(Thread.currentThread().getName() + " 3 " + (n1 + n2));
        });


        System.out.println("main Thread 종료");
        es.shutdown();
    }
}
