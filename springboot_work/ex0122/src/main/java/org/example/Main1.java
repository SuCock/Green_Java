package org.example;

class Man{
    private String name;
    Man(){
        System.out.println("Man 부모 생성자");
    }
    Man(String name){
        this.name = name;
    }
    public void yourName(){
        System.out.println("name = " + name);
    }
}
class BusinessMan extends Man{
    private String company;
    private String position;

    BusinessMan(){
        super();
        System.out.println("기본 생성자");
    }
    // super = 부모클래스 호출
    // this = 현채클래스 호출
    BusinessMan(String company, String position, String name){
        super(name);
        System.out.println("다른 생성자");
        this.company = company;
        this.position = position;
        
    }
    public void yourInfo(){
        System.out.println("company = " + company);
        System.out.println("position = " + position);
        yourName();
    }
}

public class Main1 {
    // setter
    // 생성자 초기화 방식
    public static void main(String[] args) {
        BusinessMan bm1 = new BusinessMan("그린컴퓨터학원", "강사", "홍길동");
        bm1.yourInfo();
    }
}
