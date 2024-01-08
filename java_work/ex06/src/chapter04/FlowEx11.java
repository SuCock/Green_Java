package chapter04;
import java.util.*;

class FlowEx11 {
	public static void main(String[] args) { 
		char gender;
		String regNo = "";
		System.out.print("형식에 맞춰서 주민등록번호를 입력해주세요.(011231-1111222)>");

		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();

		gender = regNo.charAt(7); 

		switch(gender) {
			case '1':
			case '3':
				switch(gender) {
					case '1':
						System.out.println("2000년대 이전의 남자입니다.");
						break;
					case '3':
						System.out.println("2000년대 이후의 남자입니다.");
						break;
				}
				break;    
			case '2':
			case '4':
				switch(gender) {
					case '2':
						System.out.println("2000년대 이전의 여자입니다.");
						break;
					case '4':
						System.out.println("2000년대 이후의 여자입니다.");
						break;
				}
				break;
			default:
				System.out.println("외계인");
		}
	} 
}
