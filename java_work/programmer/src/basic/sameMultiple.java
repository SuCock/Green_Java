package basic;

public class sameMultiple {
	public static void main(String[] args) {
		int number = 60;
		int n = 2;
		int m = 3;
		int answer = 0;
		
		if(number % n == 0 && number % m ==0) {
			answer = 1;
		}else {
			answer = 0;
		}
		System.out.println(answer);
	}
}	
