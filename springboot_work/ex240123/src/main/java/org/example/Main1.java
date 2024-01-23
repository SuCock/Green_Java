package org.example;

class SuperCls{
    public int a = 10;
    public void doA(){
        System.out.println("SuperCls doA");
    }
}
class SubCls extends SuperCls{
    public int b = 20;
    @Override
    public void doA() {
        System.out.println("SubCls doA");
    }
}
public class Main1 {
    public static void main(String[] args) {
        SuperCls sc = new SuperCls();
        sc.doA();

        SubCls subCls = new SubCls();
        subCls.doA();
    }
}
