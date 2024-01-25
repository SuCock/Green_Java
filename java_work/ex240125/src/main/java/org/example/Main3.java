package org.example;

interface Upper{
    default public String doUpper(String con){
        return con.toUpperCase();
    }
}
interface Lower{
    default public String doLower(String con){
        return con.toLowerCase();
    }
}
interface Printa{
    void doA(String con);
}
class MyPrinter implements Printa, Upper{
    @Override
    public void doA(String con) {
        System.out.println(doUpper(con));
    }
}
public class Main3 {
    public static void main(String[] args) {
        MyPrinter mp = new MyPrinter();
        mp.doA("asdfasdf");

        System.out.println(mp instanceof Upper);
        if(mp instanceof Upper){
            Upper up = mp;
        }
        try{
            Lower lw = (Lower) mp;
            System.out.println("여기는 실행안됨");
        }catch (ClassCastException cce){
            System.out.println("형변환예외");
        }
        
        System.out.println(mp instanceof Lower);
    }
}
