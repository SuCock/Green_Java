package ex06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String test = "";
		System.out.println("글을 입력하세요.");
		String temp = sc.next();
		
		for(int i = 0; i < temp.length(); i++) {
			test += temp.charAt(i) + " ";
		}
		System.out.println(test);
		System.out.println(test.split(" ")[2]);
	}
}

