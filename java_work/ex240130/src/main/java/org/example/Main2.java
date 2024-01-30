package org.example;

public class Main2 {
    public static void main(String[] args) {
        Box<String> box1 = new SteelBox<String>();
//        Box<String> box2 = new SteelBox<Integer>();

        Box<Integer> box2 = EmptyBoxFactory.makeBox();
        Box<String> box3 = EmptyBoxFactory.makeBox();

        EmptyBoxFactory.peekBox(box2, 10);
        EmptyBoxFactory.peekBox(box3, "문자열");

    }
}
