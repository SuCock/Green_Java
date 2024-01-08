package chapter04;
import java.util.*;

class FlowEx8 {
	public static void main(String[] args) { 
		char gender;
		String regNo = "";

		Scanner scanner = new Scanner(System.in);
		System.out.println("주민등록 번호를 입력해주세요.");
		regNo = scanner.nextLine();

		gender = regNo.charAt(7); 

		switch(gender) {
			case '1':
				System.out.println("2000년대 이전의 남자입니다.");
				break;
			case '3':
				System.out.println("2000년대 이후의 남자입니다.");
				break;
			case '2':
				System.out.println("2000년대 이전의 여자입니다.");
				break;
			case '4':
				System.out.println("2000년대 이후의 여자입니다.");
				break;
			default:
				System.out.println("아닐때 이쪽으로");
		}
	}
}
	
