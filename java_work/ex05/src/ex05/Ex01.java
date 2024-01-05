package ex05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result;
		
		if(n % 2 == 0) {
			result = " is even";
		}else {
			result = " is odd";
		}
		
		String result1 = n % 2 == 0 ? n + " is even" : n + " is odd";
		
		System.out.println(n + result);
		System.out.println(result1);
	}
}
