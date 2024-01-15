package introduction;

import java.util.Arrays;

public class subArr {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
		int[] answer = {};
		
		answer = Arrays.copyOfRange(numbers, num1, num2+1);
		
		System.out.println(Arrays.toString(answer));
	}
}
