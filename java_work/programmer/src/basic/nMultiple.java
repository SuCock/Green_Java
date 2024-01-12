package basic;

public class nMultiple {
	public static void main(String[] args) {
		int num = 98;
		int n = 2;
		int answer = 0;
		
		if(num % n == 0) {
			answer = 1;
		}else {
			answer = 0;
		}
		System.out.println(answer);
	}
}
