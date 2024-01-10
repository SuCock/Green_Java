package ex08;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		String todolist[] = new String[100];
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("할 일 추가 만들기");
				todolist[0] = "공부";
			}else if(select == 2) {
				todolist[0] = "";
				System.out.println("할 일 삭제 만들기"); 
			}else if(select == 3) {
				System.out.println("우선순위 부여 만들기"); 
			}else {
				break;
			}
		}
		System.out.println(todolist[0]);
	}
}
