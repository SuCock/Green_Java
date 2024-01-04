package programmer;

public class pizza {
	public static void main(String[] args) {
		int n = 15;
		int answer = 0;
		
		if(n % 7 != 0) {
			answer = n / 7 + 1;
		}else {
			answer = n / 7;
		}
		
		
		System.out.println(answer);
	}
}
