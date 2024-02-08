package org.example;

interface Calcu {
    void cal(int a, int b, int c);
}

interface RetCalcu {
    int cal(int a, int b);
}

public class Main2 {

    // 가변인자를 사용하면 a, b를 일일히 안적고 배열로 보낼 수 있다.
    public static void doA(Calcu cc, int... a) {
        cc.cal(a[0], a[1], a[2]);
    }

    public static void main(String[] args) {
        
        // 중괄호를 없애면 return생략 가능
        RetCalcu rcc = (a, b) ->
             a + b;
        ;

        int result = rcc.cal(5, 5);
        System.out.println(result);

        doA((a, b, c) -> {
            System.out.println(a + b + c);
        }, 10, 20, 30);

//        Calcu cc1  = ((a, b) -> System.out.println(a + b));
//        cc1.cal(10, 20);
//
//        Calcu cc2  = ((a, b) -> System.out.println(a - b));
//        cc2.cal(10, 20);
    }
}
