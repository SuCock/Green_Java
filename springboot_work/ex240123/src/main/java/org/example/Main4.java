package org.example;

class Cake{
    public void yummy(){
        System.out.println("Cake yummy");
    }
}
class ACake extends Cake{
    public void yummy(){
        System.out.println("ACake yummy");
    }
}
class BCake extends ACake{
    public void yummy(){
        super.yummy(); // 부모호출
        System.out.println("BCake yummy");
    }
}
public class Main4 {
    public static void main(String[] args) {
        // 함수명이 같으면 자식객체의 함수를 불러온다.
        Cake cb = new BCake();
        Cake ca = new ACake();
        cb.yummy();
        ca.yummy();

        System.out.println("=======================");
        System.out.println(cb instanceof BCake);
        System.out.println(cb instanceof ACake);
        System.out.println("=======================");

        System.out.println("=======================");
        System.out.println(ca instanceof BCake);
        System.out.println(ca instanceof ACake);
        System.out.println("=======================");
    }
}
