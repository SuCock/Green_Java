package ex08;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt(); // 영수증 총 값
		int productCnt = sc.nextInt(); // 영수증 구매한 물건 갯수
		int calcu_total = 0; // 직접 계산한 총 값
		int[] itemPrice = new int[productCnt];
		int[] itemCnt = new int[productCnt];
		
		// item 입력
		for(int i = 0; i < productCnt; i++) {
			itemPrice[i] = sc.nextInt();
			itemCnt[i] = sc.nextInt();
		}
		
		for(int i = 0; i < productCnt; i++) {
			calcu_total = calcu_total + (itemPrice[i] * itemCnt[i]);
		}
		System.out.println(calcu_total);
		
		if(total == calcu_total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
