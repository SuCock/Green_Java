package programmer;

import java.util.Arrays;

public class hate {
	public static void main(String[] args) {
		int n = 10;
		int[] answer = new int[n];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0) {
				answer[index++] = i; // i가 들어가면 배열이 하나씩 증가
			}
		}
		System.out.println(Arrays.toString(answer));

	}
}
