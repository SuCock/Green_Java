package basic;

public class stiString {
	public static void main(String[] args) {
		String ineq = "<";
		String eq = "=";
		int n = 20;
		int m = 50;
		int answer = 0;
		
		if(ineq == "<" && eq == "=") {
			if(n <= m ) {
				answer = 1;
			}else {
				answer = 0;
			}
		}else if(ineq == ">" && eq == "=") {
			if(n >= m ) {
			answer = 1;
			}else {
				answer = 0;
			}
		}else if(ineq == ">" && eq == "!") {
			if(n > m) {
				answer = 1;
			}else {
				answer = 0;
			}
		}else if(ineq == "<" && eq == "!") {
			if(n < m) {
			answer = 1;
			}else {
				answer = 0;
			}
		}
		System.out.println(answer);
	}
}
