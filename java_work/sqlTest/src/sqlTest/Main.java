package sqlTest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DB db = new DB();
		
		System.out.println("1. 할일입력");
		System.out.println("2. 할일조회");
		System.out.println("3. 종료");
		System.out.println("번호 입력하세요");
		
		String input = sc.nextLine();
		
		if(input.equals("1")) {
			db.insert();
		}else if(input.equals("2")) {
			db.select();
		}else {
			System.out.println("종료합니다.");
		}
	}
}
