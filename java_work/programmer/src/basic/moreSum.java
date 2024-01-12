package basic;

public class moreSum {
	public static void main(String[] args) {
		int a = 9;
		int b = 91;
		int answer = 0;
		String ab = a + "" + b;
		String ba = b + "" + a;
		
		if(Integer.parseInt(ab) > Integer.parseInt(ba)) {
			answer = Integer.parseInt(ab);
		}else if(Integer.parseInt(ab) == Integer.parseInt(ba)){
			answer = Integer.parseInt(ab);
		}else {
			answer = Integer.parseInt(ba);
		}
		
		System.out.println(answer);
	}
}
