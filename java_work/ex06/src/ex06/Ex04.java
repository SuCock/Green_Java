package ex06;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h == 0) {
			h = 24;
		}
		
		if(m < 45) {
			h = h-1;
			m = (m+60)-45;
		}else {
			m = m-45;
		}
		System.out.println(h);
		System.out.println(m);
	}
}
