package ex11;

public class Ex10 {
	public static void main(String[] args) {
		int result = fact(5);
		int result1 = doA(5);
		System.out.println(result1);
	}
	// fact(5)
	// 5 * fact(4)
	// 5 * 4 * fact(3)
	// 5 * 4 * 3 * fact(2)
	// 5 * 4 * 3 * 2 * fact(1)
	// 5 * 4 * 3 * 2 * 1 * 1
	public static int fact(int num) {
		if(num > 0) {
			return num * fact(num - 1);
		}else {
			return 1;
		}
	}
	// 2 * 2 * 2 * 2 * 2
	public static int doA(int num) {
		if(num > 0) {
			return 2 * doA(num-1); // 반복하는 횟수
		}else {
			return 1;
		}
		}
	}
