package org.example;

public class Ex06 {
    public static void type(Scale sc) {
        switch (sc){
            case DO:
                System.out.println("도~~~~~~~~");
                break;
        }
    }

    public static void main(String[] args) {
        type(Scale.DO); // 도~~~~~~~~~~
        System.out.println(Scale.DO); // DO 문자열 그대로 나온다.
    }
}
