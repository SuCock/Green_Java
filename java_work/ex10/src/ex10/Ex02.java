package ex10;

/*
 * Tv라는 객체를 클래스로 만들도록 한다.
 * 속성(변수) 과 기능(메서드)
 */

public class Ex02 {
	public static void main(String[] args) {
		Tv t = new Tv();
		System.out.println(t.color); // 클래스 안에 변수 호출
		System.out.println(t.power);
		System.out.println(t.channel);
		
		t.power(); // 클래스 안에 함수 호출
		System.out.println(t.power);
		t.channelUp();
		System.out.printf("현재 체널은 %d 입니다.", t.channel);
		System.out.println();
		t.channelDown();
		System.out.printf("현재 체널은 %d 입니다.", t.channel);
		System.out.println();
		t.channelDown();
		System.out.printf("현재 체널은 %d 입니다.", t.channel);
	}
}
