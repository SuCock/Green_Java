package org.example;

public class EmptyBoxFactory {
    public static <T> Box <T> makeBox(){
        Box<T> box = new Box<T>();
        return box;
    }
    
    // extends를 쓰면 get만 가능
    // super를 쓰면 set만 가능
    public static void inBox(Box <? extends Toy> box, Toy n){
        Toy toy = box.getObj();
        System.out.println(box);
    }

    public static void outBox(Box <? super Toy> box, Toy n){
        System.out.println(box);
    }
    
    // 원래는 오버로딩이 안되지만 
    // 와일드 카드를 쓰면 오버로딩 가능
    public static void peekBox(Box<?> box, int b){
        System.out.println(box);
    }

    public static void peekBox(Box<?> box, String a){
        System.out.println(box);
    }
}
