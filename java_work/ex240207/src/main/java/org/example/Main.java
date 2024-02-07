package org.example;

// 스태틱 메서드 에서는 스태틱 변수 사용 가능, heap 영역 변수 사용 불가능
// heap 메서드 이면 heap영역 변수, 스태틱 변수 사용 가능
// 메모리 상에 올려놓고 사용해야한다.
class Outer{
    public static int num = 0;
    public static class Nestd1{
        public void add(int n){
            Outer.num += n;
        }
    }

    public static class Nestd2{
        public int get(){
            int a = 10;
            return num + a;
        }
        public void doPrint(){
            System.out.println(num);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Nestd1 ns1 = new Outer.Nestd1();
        Outer.Nestd2 ns2 = new Outer.Nestd2();

        ns1.add(100);
        System.out.println(ns2.get());
        ns2.doPrint();
    }
}