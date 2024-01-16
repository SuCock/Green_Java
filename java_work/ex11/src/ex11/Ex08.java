package ex11;

public class Ex08 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		double myHeight = 170.5;
		hieveryone(12, 169.2);
		hieveryone(13, myHeight);
		System.out.println("프로그램 끝");
	}

	public static void hieveryone(int age, double height) {
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("제 키는 " + height + " 입니다.");
	}
}
