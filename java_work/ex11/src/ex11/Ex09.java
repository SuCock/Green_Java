package ex11;

public class Ex09 {
	public static void main(String[] args) {
		doAdd(10, 20);
		divide(100, 0);
	}
	public static int doAdd(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		return result;
	}
	public static int divide(int num1, int num2) {
		int result = 1;
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.\n" + result);
			return result;
		}
		result = num1 / num2;
		System.out.println(result);
		return result;
	}
}
