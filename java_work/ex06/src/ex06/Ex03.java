package ex06;

import java.util.Scanner;

/*
 * 성적을 입력받아 90점이상이면 A
 * 			  80점 이상이면 B
 * 			  70점 이상이면C
 * 			  그외에 D
 */

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
	}
}
