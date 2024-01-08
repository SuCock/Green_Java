package ex06;

public class Ex01 {
	public static void main(String[] args) {
		int a = 3;
		int b = 12;
		int answer = 0;
		int aa = Integer.parseInt(a+""+b);
		int bb = Integer.parseInt(b+""+a);
		
		if(aa < bb) {
			answer = bb;
		}else{
			answer = aa;
		}
		System.out.println(answer);
		
	}
}
