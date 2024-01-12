package basic;

public class bigReturn {
	public static void main(String[] args) {
		int a = 91;
		int b = 2;
		int answer = 0;
		int ab = Integer.parseInt(a + "" + b);
		int aa = 2 * a * b;
		
		if(ab < aa) {
			answer = aa;
		}else {
			answer = ab;
		}
		System.out.println(answer);
	}
}
