package programmer;

import java.util.Arrays;

public class centerNum {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		
		Arrays.sort(array);
		
        int answer = Math.round(array.length/2);
        
        int result = array[answer];
		
		// 전체길이 나누기 2 더하기 1
		System.out.println(result);
		
	}
}
