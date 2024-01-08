package ex06;

public class Ex07 {
	public static void main(String[] args) {
		int sum = 0;
		// 0에서 9까지 합을 출력해주세요
		// 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = ?
		
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println("0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + sum);
	}
}
