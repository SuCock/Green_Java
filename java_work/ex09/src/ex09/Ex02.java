package ex09;

/*
 * 정수가 담긴 리스트 num_list가 주어질 때, 
 * 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록
 * solution 함수를 완성해주세요.
 */

public class Ex02 {
	public static void main(String[] args) {
		int[] num_list = {3, 4, 5, 2, 1};
		int answer = 0;
		int sumAdd = 0; // 모든 원소들의 합
		int sumTim = 0; // 모든 원소들의 합의 제곱
		int sumAllTim = 0; // 모든 원소들의 곱
		
		for(int i = 0; i < num_list.length; i++) {
			sumAdd += num_list[i];
			sumTim = sumAdd * sumAdd;
			sumAllTim = num_list[0];
			for(int j = 1; j < num_list.length; j++) {
				sumAllTim *= num_list[j];
			}
		}
		if(sumAllTim < sumTim) {
			answer = 1;
		}else {
			answer = 0;
		}
		System.out.println(answer);
	}
}
