package ex05;

public class Ex05 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean c = a>b && b> (b=30);
		
		System.out.println(c); // 앞부분에서 이미 거짓으로 나왔으니 30을 대입하지 않는다.
		System.out.println(b);
		
		boolean d = a<b || b> (b=30);
		
		System.out.println(d); // 둘중에 하나만 참이여도 참이니깐 뒤에서 30을 대입하지 않는다.
		System.out.println(b);
		
		boolean e =a<b && b> (b=30);
		
		System.out.println(e); // 두개 다 참이여야 확인이 가능함으로 뒤에서 대입 후 거짓으로 나왔다.
		System.out.println(b);
	}
}
