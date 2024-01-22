package org.example;

class A1{
    private String name;
    // setter 를 사용해서 변수 값 바꾸기
    public void setName(String name){
        this.name = name;
    }
    public A1(){
    }
    // 생성자로 변수 값 바꾸기
    public A1(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "A1{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main2 {
    // 생성자로 클래스변수 private 값을 바꿀 수 있다.
    // 클래수변수 private setter 값을 바꿀 수 있다.
    public static void main(String[] args) {
        A1 a1 = new A1("A1");
        System.out.println(a1);

        A1 a11 = new A1();
        a11.setName("setter");
        System.out.println(a11);

    }
}
