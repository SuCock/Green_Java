package org.example;

interface  AA{
    // 몸체가 없는 추상메서드1
    public void aa(String s);
    // 몸체가 없는 추상메서드2
//    public void f1();
    default void bb(){
        System.out.println("몸체가 있는 메서드");
    }
    static void cc(){
        System.out.println("스태틱 메서드");
    }
}

//class AAA implements AA{
//
//    @Override
//    public void aa() {
//        System.out.println("제일 옛날 방법");
//    }
//}

public class Main5 {
    public static void main(String[] args) {
        // 스태틱 메서드
        AA.cc();

        // 익명 클래스
//        AA aa = new AA() {
//            @Override
//            public void aa() {
//
//            }
//        };
//        AAA aaa = new AAA();
//        // default 메서드라서 정의한걸 써야한다
//        aa.bb();

        // 몸체가 있는 메서드가 아닌 추상메서드가 복수가 되면 사용 못 한다.
        AA laa = (String s) -> {
            System.out.println("람다" + s);
        };

        // 무슨 타입인지 알아서 추론해준다.
        AA laa1 = ( s) -> {
            System.out.println("람다" + s);
        };

        laa.aa("매개변수");
        laa1.aa("타입 생략가능");

    }
}