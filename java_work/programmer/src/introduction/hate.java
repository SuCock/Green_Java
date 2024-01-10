package introduction;

import java.util.Arrays;

public class hate {
	public static void main(String[] args) {
		int n = 10;
		int index = 0;
		int [] answer = {};
		int [] answer2 = new int [n];
		if(n % 2 == 0) {
			answer = new int[n/2];
		}else {
			answer = new int[n/2+1];
		}
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				answer[index++] = i; // i가 들어가면 배열이 하나씩 증가 -> 그 전에는 만들어진 배열에 홀 수 번째에 들어가져서 중간에 0이 들어갔다
				answer2[i] = i;
			} 
		}
		System.out.println(Arrays.toString(answer));
		System.out.println(Arrays.toString(answer2));
	}
}
