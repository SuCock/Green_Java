package org.example;

public class Main3 {
    public static void main(String[] args) {
        Print  prn = new Print();
        prn.print();

        Printable printable = new Printable(){
            // print함수의 재정의1
            @Override
            public void print() {
                System.out.println("인터페이스");
            }
        };
        printable.print();
        
        // print함수의 재정의2
        Printable lamda1 = () -> {
            System.out.println("람다");
        };
        lamda1.print();
    }
}
