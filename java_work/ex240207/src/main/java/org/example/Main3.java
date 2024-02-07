package org.example;

import java.util.ArrayList;

interface Printable{
    public void print();
}

class Paper{
    private String con;

    public Paper(String con) {
        this.con = con;
    }

    public Printable getPrinter() {
        // 로컬 클래스 : 메서드 안에 클래스
        class Printer implements Printable {
            @Override
            public void print() {
                System.out.println(con);
            }
        }
        return new Printer();
    }
    public Printable getPrinter1() {
        return new Printable() {
            // 익명 클래스 
            @Override
            public void print() {
                System.out.println(con);
            }
        };
    }

    public Printable getPrinter2() {
        // 람다
        return () -> {
            System.out.println(con);
        };
    }
}
public class Main3 {
    public static void main(String[] args) {
        Paper p = new Paper("긍정적");
        Printable printable = p.getPrinter();
        printable.print();
    }
}
