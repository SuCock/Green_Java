package ex09;

public class Ex01 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 3;
		int answer = 0;
		
		if(a == b && a == c) {
			answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
		}else if(a == b || a == c || b == c) {
			answer = (a + b + c) * (a * a + b * b + c * c);
		}else {
			answer = a + b + c;
		}
		
		System.out.println(answer);
	}
}
