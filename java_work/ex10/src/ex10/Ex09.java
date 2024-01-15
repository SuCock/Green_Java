package ex10;

public class Ex09 {
	
	Ex09(){
		System.out.println("기본생성자");
	}
	
	public static void doA() {
		System.out.println("static함수");
	}
	
	public  void doB() {
		System.out.println("non-static함수");
	}
	
	public static void main(String[] args) {
		doA();
		Ex09.doA(); // static방법
		
		Ex09 ex09 = new Ex09();
		ex09.doA();
		ex09.doB();
		
	}
}
