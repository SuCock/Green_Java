package org.example;

interface A{
    public void doA();
    default public void doB(){
        System.out.println("A default");
    };
    static public void doC(){
        System.out.println("Static");
    }
}
public class Main2 {
    public static void main(String[] args) {
        A.doC();
        A a = new A(){
            @Override
            public void doA() {
                System.out.println("A doA");
            }
        };
        a.doA();
        a.doB();
        
        A a1 = () -> {
            System.out.println("람다");
        };

        a1.doA();
        a1.doB();
    }
}
