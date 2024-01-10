package chapter04;
import java.util.*;

class FlowEx32 {
	public static void main(String[] args) { 
		int menu = 0;
		int num  = 0;

		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("(1) 제곱을 구해라");
			System.out.println("(2) 루트를 구해라");
			System.out.println("(3) 로그10을 구해라");
			System.out.print("1,2,3중에 선택하세요>");

			String tmp = scanner.nextLine(); 
			menu = Integer.parseInt(tmp);    

			if(menu==0) {
				System.out.println("종료됩니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("다시 숫자 입력");
				continue;		
			}else {
				System.out.println("제곱 = " + menu * menu);
				System.out.println("루트 = " + Math.sqrt(menu));
				System.out.println("로그 = " + Math.log10(menu));
			}
		}
	} 
}
