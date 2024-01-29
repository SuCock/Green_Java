package org.example;

class Mbox<T>{
    private T t;
    public Mbox<T t>{
        this.t;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Mbox<String> mbox = new Mbox<>("I am so happy");
        System.out.println(mbox);

        Mbox<Mbox <Integer>> imbox = new Mbox<>(100);
        System.out.println(imbox);

        Mbox<Mbox<String>> mbox1 = new Mbox<>();
    }
}
