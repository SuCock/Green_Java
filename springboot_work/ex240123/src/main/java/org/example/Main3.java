package org.example;

class MobilePhone{
    protected String number;
    public MobilePhone(String number){
        this.number = number;
    }
    public void answer(){
        System.out.println("대답했다 번호는 " + number);
    }
}

class SmartPhone extends MobilePhone{
    private String androidVer;
    public SmartPhone(String number, String var) {
        super(number);
        this.androidVer = var;
    }
    public void playApp(){
        System.out.println("앱 실행함 안드로이드 버전은 " + androidVer);
    }
}

public class Main3 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("010-9946-2662", "1.0");
        sp.playApp();
        sp.answer();
        
        // 부모객체       // 자식객체
        // 자긱객체는 부모객체에 담을 수 있다.
        // 부모객체는 자식객체를 참조할 수 있다.
        // 다형성이라고 한다.
        MobilePhone mp = new SmartPhone("010-1234-1234", "2.0");
        mp.answer();
    }
}
