package ex03;

import java.util.Scanner;

//입력받은 n 만큼 str 값을 출력해라

public class Ex02 {
	public static void main(String[] args) {
		// 참조 변수 선언
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("반복할 문자를 입력해주세요.");
		String str = scan.next();
		
		System.out.println("반복할 수를 입력해주세요.");
		int n = scan.nextInt();
		
		System.out.println("str = " + str);
		System.out.println("n = " + n);
		
		for(int i = 0; i<n; i++) {
			System.out.println(str);
		}
	}
}
