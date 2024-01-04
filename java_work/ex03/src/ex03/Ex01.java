package ex03;

import java.util.Scanner;

//문자열 str과 정수 n이 주어집니다.
//str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.

public class Ex01 {
	public static void main(String[] args) {
		// 참조 변수 선언
		Scanner scan  = new Scanner(System.in);
		System.out.println("반복할 문자를 입력해주세요.");
		String str = scan.next();
		System.out.println("반복할 수를 입력해주세요.");
		int n = scan.nextInt();
		
		// n만큼 뒤에 붙여준다(반복문 안써도 됨)
		System.out.println("repeat 사용");
		System.out.print(str.repeat(n));
		System.out.println("for문 사용");
		for(int i = 0; i<n ; i++) {
			System.out.print(str);
		}
	}
}
