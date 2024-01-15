package ex10;

public class Ex03 {
	// 같은 패키기 내에서는 같은 클래스명이 존재하면 안된다.
	public static void main(String[] args) {
		
		// class Tv 안에는 채널, 색상, 전원을 변수로 있다
		// 캡슐화(안에 뭐가 있는지 정확히 모르는 상태)
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 10;
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		t1.channelDown();
		t1.channelUp();
	}
}
