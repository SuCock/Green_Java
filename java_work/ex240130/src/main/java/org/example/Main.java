package org.example;

import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Box<String>> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Box<String> box = new Box<>();
            box.setObj("String 넣었어");
            list.add(box);
        }

        list.get(0).setObj("바뀜");
        System.out.println(list);
    }
}