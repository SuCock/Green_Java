package ex10;

import java.util.Scanner;

/*
 * 숫자 두개를 입력받고
 * + - *\/
 */

public class Ex10 {
	
	public int solution(int num1, int num2, String yon) {
		int result = 0;
		
		if(yon.equals("+")) {
			result = num1 + num2;
		}else if(yon.equals("-")) {
			result = num1 - num2;
		}else if(yon.equals("*")) {
			result = num1 * num2;
		}else if(yon.equals("/")) {
			result = num1 / num2;
		}
		System.out.printf("%d %s %d = %d ",num1,yon,num2,result);
		System.out.println();
		
		return result;
	}
	
	Ex10(){
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번쨰 수 입력 >");
		int num1 = sc.nextInt();
		System.out.println("두 번째 수 입력 >");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력 >");
		String yon = sc.next();
		
		
		solution(num1, num2, yon);
		System.out.println("num 1 = " + num1 + " num2 = " + num2 + " you = " + yon);
	}
	
	public static void main(String[] args) {
		new Ex10();
	}
}
