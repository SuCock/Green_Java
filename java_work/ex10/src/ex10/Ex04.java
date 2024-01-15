package ex10;

public class Ex04 {
	public static void main(String[] args) {
		// 배열은 기본형 타입의 배열이면 0으로 초기화
		// 참조형 타입은 null값으로 초기화 한다.
		Tv[] tv = new Tv[100];
		
		// 전체 배열을 선언해도 하나하나의 값들이 인스턴스화가 되지 않는다.
		// 인스턴스화 -> 메모리에 올린다
		for(int i = 0; i < tv.length; i++) {
			tv[i] = new Tv();
		}
		
		// nullPointerException 오류
		System.out.println(tv[0].channel); // -> null오류
		System.out.println(tv[1]);
		System.out.println(tv[2]);
		
		// int의 객체는 == Integer
		int[] a = new int[10];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		// 객체
		String[] c = new String[10];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
	}
}
