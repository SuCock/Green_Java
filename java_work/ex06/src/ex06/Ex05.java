package ex06;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 시간 입력");
		String h = sc.nextLine();
		String m = sc.nextLine();
		
		int hour = Integer.parseInt(h);
		int min = Integer.parseInt(m);
		
		System.out.println("현재 시간 = " + hour + "시 " + min + "분");

		System.out.println("걸리는 시간 입력");
		int forMin = sc.nextInt();
		
		System.out.println("걸리는 시간 " + forMin);
		
		int a = hour*60 + min + forMin;
		hour = a/60;
		min = a%60;
		
		if(hour >= 24) {
			hour = hour - 24;
		}
		
		System.out.println("요리가 끝난 시간 = " + hour + "시 " + min + "분");
	}
}
