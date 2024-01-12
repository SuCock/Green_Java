package basic;

public class evenOddReturn {
	public static void main(String[] args) {
		int n = 7;
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % 2 != 0) {
				if(i % 2 != 0) {
					answer += i;
				}
		}else {
				if(i % 2 == 0) {
					answer += i * i;
				}
			}
		}
		System.out.println(answer);
	}
}
