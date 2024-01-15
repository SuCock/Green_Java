package ex10;

class AA{
	int a = 10; // 인스턴스화를 해줘야 메모리에 올라간다.
	static int b = 20; // static은 프로그램 시작되자마자 메모리에 올라간다.
}

public class Ex05 {
	public static void main(String[] args) {
		AA a1 = new AA();
		AA a2 = new AA();
		
		a1.a++;
		System.out.println(a1.a);
		System.out.println(a2.a);
		
		a1.b++;
		System.out.println(a1.b);
		System.out.println(a2.b);
		
	}
}
