package ex11;


class MyClass {

	@Override
	public String toString() {
		return "MyClass";
	}
}

public class Ex05 {
	
	static int doA() {
		return 10;
	}
	
	static MyClass doClass() {
		MyClass mc = new MyClass();
		return mc;
//		return new MyClass();
	}
	
	public static void main(String[] args) {
		MyClass mc = doClass();
		System.out.println(mc);
		int A = doA();
		System.out.println(A);
	}
}
