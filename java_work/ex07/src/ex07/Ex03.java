package ex07;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; ; i++) {
			String temp = sc.nextLine();
			if(temp.equals("0 0")) {
				System.out.println("종료");
				break;
			}
			int num1 = Integer.parseInt(temp.split(" ")[0]);
			int num2 = Integer.parseInt(temp.split(" ")[1]);
			System.out.println("num1 = " + num1);
			System.out.println("num2 = " + num2);
			System.out.println("num1 + num2 = " + (num1 + num2));
			System.out.println(temp);
		}
	}
}	
