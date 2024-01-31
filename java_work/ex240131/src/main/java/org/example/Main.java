package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Park");
        Person p2  = new Person("Yoon");

        p1 = null;
        p2 = null;

        System.gc(); // 가비지 컬렉셕(힙 영역에 있는걸 삭제하라는 직접지시)
        System.runFinalization(); // 소면시 호풀되는 함수 실행

        System.out.println("End of Program");
    }
}