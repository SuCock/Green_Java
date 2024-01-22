package org.example;

class SuperCls{
    static int count = 0;
}

class SubCls extends SuperCls{
    public void setCount(){
        SuperCls.count = 100;
    }
}

public class Main3 {
    public static void main(String[] args) {
        System.out.println(SuperCls.count);
        System.out.println(SubCls.count);

        SubCls.count = 200;

        System.out.println(SuperCls.count);
        System.out.println(SubCls.count);

        SubCls sc = new SubCls(); // static이 없음으로 직접 인스턴스화를 해줘야한다.
        sc.setCount();
        System.out.println(SuperCls.count);
        System.out.println(SubCls.count);
    }
}
