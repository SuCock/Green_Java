package ex03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		// next() 문자열입력...빈공백전까지...
		// nextLine() 문자열 한줄...
		// nextInt() 정수 입력
		// nextDouble() 실수 입력
		double d = sc.nextDouble();
		
		System.out.println("d = " + d);
		
		//double trans_d = (int)(d*100)/100.0;
		System.out.println("trans_d = " + (int)(d*100)/100.0);
	}
}
