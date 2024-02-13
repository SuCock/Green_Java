package org.example;

import java.util.function.Consumer;

interface AA{
    public void doA();
}

//interface MyConsumer<T>{
//    public void accept(T t);
//}

public class Main {
    public static void aa(AA aa, String str){
        aa.doA();
    }

    // 위에 따로 interface를 선언하지 않아도 자바에서 제공해주는 interface
    public static void aa1(Consumer<String> consumer, String str){
        consumer.accept(str);
    }

    public static void main(String[] args) {
        AA a = () -> {
            System.out.println("안녕하세요");
        };

        a.doA();
        
        aa(() -> {
            System.out.println("함수 매개변수 보내기");}
                , "문자열"
        );

        aa1(s -> {
            System.out.println(s);
        }, "만들어져있어요.");
    }
}