package ex04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// && || ! & | ^ ~
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		// 입력받은 값이 a와 b사이인지 확인하는 것을 출력
		// a<15<b
		Scanner sc = new Scanner(System.in);
//		System.out.println("비교할 숫자를 입력하세요.");
//		int num = sc.nextInt();
		int num = 15;
		System.out.println(a<num && num<b);
		
		// 최소 공배수 최대 공약수...
		// a > num || b > num
		// 30/2 ==? 0
		// 30을 2로 나누었을때 나머지가 0 or 30을 7로 나누었을떄 나머지 0
		System.out.println(30%2==0 || 30%7==0);
		
		boolean aa = true;
		if(30%2==0 && 30%7==0) {
			System.out.println("aa의 값은 참입니다.");
		}else {
			System.out.println("aa의 값은 거짓입니다.");
		}
	}
}
