package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        AA.doB();

        AA a1 = new AA();
        a1.doA();
        System.out.println(a1.getA());
    }
}