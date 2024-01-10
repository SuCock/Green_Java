package chapter04;
import java.util.*;

class FlowEx28 {
	public static void main(String[] args) { 
		int input  = 0;
		int answer = 0;

		answer = (int)(Math.random() * 100) + 1; // 1~100������ ������ ���� ����
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("1에서 100사이의 수.>>>>>>>>>");

			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);

			if(input > answer) {
				System.out.println("다운.");	
			} else if(input < answer) {
				System.out.println("업.");			
			}
		} while(input!=answer);

		System.out.println("종료.");
	}
}
