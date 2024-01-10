package ex08;

/*
 * 1~46의 random한 숫자 3개를 꺼내서 같은 숫자가 나오면 true 출력 / 아니면 false
 */

public class Ex04 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		
		System.out.printf("a = %d, b = %d, c = %d",a,b,c);
		
		System.out.println();
		
		a = (int)(Math.random()*45) + 1;
		b = (int)(Math.random()*45) + 1;
		c = (int)(Math.random()*45) + 1	;	
		System.out.printf("a = %d, b = %d, c = %d",a,b,c);
		
		System.out.println();
		
		System.out.println(a == b || a == c || b == c);
	}
}
