package introduction;

import java.util.Arrays;

public class evenOdd {
	public static void main(String[] args) {
		int[] num_list = {1, 3, 5, 7};
		int[] answer = new int [2];
		
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i] % 2 == 0) {
				answer[0] += 1;
			}else {
				answer[1] += 1;
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
