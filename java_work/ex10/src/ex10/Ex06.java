package ex10;

// 생략 되어진 표현
// import java.lang.*;
// 기본생성자

public class Ex06 {
	
	// 생성자 메소드는 아주 조금 다르다
	// 생성자는 리턴값이 안적혀있다
	// 메소드는 리턴값이 적혀있따.
	
	// 클래스 함수는 인스턴스화 해야지만 사용할 수 있다.
	public void doA() {
		System.out.println("doA 메서드 입니다");
	}
	
	//static은 메모리 공간에 항상 상주 한다
	public static void doB() {
		System.out.println("doB 메서드 입니다");
	}
	
	// 생성자
	Ex06(){ 
		System.out.println("기본 생성자");
	}
	
	public static void main(String[] args) {
		Ex06 ex06 = new Ex06();
		ex06.doA(); // 인스턴스 함수 호출
		
		Ex06.doB(); // static 함수 호출
	}
}
