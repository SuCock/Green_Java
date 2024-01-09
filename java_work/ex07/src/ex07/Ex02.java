package ex07;

public class Ex02 {
	public static void doA() {
		System.out.println("doA 매개변수 없는 함수");
		return; // 함수 종료
	}
	public static void doB(int a) {
		System.out.println("doA 매개변수 a = " + a);
		if(a == 10) {
			return;
		}else if(a == 8){
			System.out.println("종료됩니다.");
			return;
		}
		System.out.println("if구문 else구문에 못갔다");
	}
	// void String int boolean char
	public static int doC(int a) {
		return a * a;
	}
	public static void doD() {
		String a = "abcdef";
		System.out.println(a.substring(3));
		System.out.println("abcdef".substring(3, 5));
	}
	public static void main(String[] args) {
		doA();
		doB(7); // doB함수는 받아야함으로 없으면 오류가 뜬다.
		doC(8);
		System.out.println(doC(10)); // doC를 타고 온다.
	}
}
