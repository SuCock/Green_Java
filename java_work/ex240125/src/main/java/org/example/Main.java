package org.example;

interface Pritable{
    int a = 10;
    public void print(String doc);
    // interface안에 몸체가 있는 메소드를 만드는 문법
    default public void doA(){
        System.out.println("doA 메소드입니다.");
    }
}
interface CMYKPrintable extends Pritable{
    public void printCMYK(String doc);
}
class SPrint implements Pritable{
    @Override
    public void print(String doc) {
        System.out.println("Samsung Print 출력합니다.");
        System.out.println(doc);
    }
}
class LPrint implements Pritable{
    @Override
    public void print(String doc) {
        System.out.println("LG Print 출력합니다.");
        System.out.println(doc);
    }
}

class PRN909 implements CMYKPrintable{
    @Override
    public void printCMYK(String doc) {
        System.out.println("Samsung Print 컬러 출력합니다.");
        System.out.println(doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("LG Print 흑백 출력합니다.");
        System.out.println(doc);
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String doc = "REPORT";

        SPrint sp = new SPrint();
        sp.print(doc);
        LPrint lp = new LPrint();
        lp.print(doc);
        
        // 클래스는 람다가 안된다
        Pritable pa1 = (d) -> {
            System.out.println("람다");
        };
        pa1.print(doc);

        PRN909 prn909 = new PRN909();
        prn909.print("흑백출력");
        prn909.printCMYK("컬러출력하자");
    }
}