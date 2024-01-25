package org.example;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("시작");
        try {
            // 강제로 내가 예외 발생 시키기
            throw  new MyException2("새로운 예외");
        } catch (MyException2 e) {
            e.printStackTrace();
        }
        System.out.println("끝");
    }
}
