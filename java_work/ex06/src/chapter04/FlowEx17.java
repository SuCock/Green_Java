package chapter04;
import java.util.*;

class FlowEx17 {
	public static void main(String[] args) { 
		int num = 0;

		System.out.print("삼각형의 세로 길이를 지정해주세요.>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();  
		num = Integer.parseInt(tmp);      

		for(int i=num;0<i;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k = num; i <= k; k--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	} 
}
