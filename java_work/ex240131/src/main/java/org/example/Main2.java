package org.example;

public class Main2 {
    public static void main(String[] args) {
        Inum inum1 = new Inum(10);
        Inum inum2 = new Inum(10);
        Inum inum3 = new Inum(13);

        System.out.println(inum1);
        System.out.println(inum2);
        System.out.println(inum3);

        System.out.println(inum1 == inum2);
        System.out.println(inum1.equals(inum2));
    }
}
