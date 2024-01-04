package ex03;

import java.util.Scanner;

// 대문자로 바꾸기

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요.");
		String str = sc.next();
		
		System.out.println(str.toUpperCase());
	}
}
