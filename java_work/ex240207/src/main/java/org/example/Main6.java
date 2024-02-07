package org.example;

// 기본형 타입 매개변수
// 참조형 타입 매개변수
class BB{};

interface Inter{
    public void interFunction();
}

public class Main6 {
    public Main6(){
        doA(100, new BB(), () -> { System.out.println("aaa"); });
    }
    
    public void doA(int a, BB b, Inter inter){
        // Inter안에있는 메서드까지 불러와야한다.
        inter.interFunction();
        System.out.println("test");
    }

    public static void main(String[] args) {
        new Main6();
//        Main6 m6 = new Main6();
//        m6.doA();
    }
}
