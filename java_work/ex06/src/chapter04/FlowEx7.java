package chapter04;
import java.util.*;

class FlowEx7 {
	public static void main(String[] args) { 
		int user, com;
		
		System.out.println("숫자를 입력해주세요.");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); 
		user = Integer.parseInt(tmp); 
		
		// Math.random();
		// 0<x<1
		// 0<x<3
		// 0.0000000001
		// 2.9999999999
		// com 1~3 중에 1,2,3,3,3,2,1

		com = (int)(Math.random() * 3) + 1;  

		System.out.println("입력한 값은 "+ user +"입니다.");
		System.out.println("랜덤값  "+ com +"입니다.");

		switch(user-com) { // user가 입력한 값이 랜덤값과 뻈을 떄
			case 2: case -1:
				System.out.println("user - com의 값은 2이거나 -1입니다.");
				break;
			case 1: case -2:
				System.out.println("user - com의 값은 1이거나 -2입니다.");
				break;
			case 0:
				System.out.println("user - com의 값은 0입니다.");
				break;	
			default:
				System.out.println("예외 값입니다.");
		}
	} 
}
