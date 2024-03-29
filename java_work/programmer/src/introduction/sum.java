package introduction;

import java.util.Arrays;

/*
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 
 * 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 
 * 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */

public class sum {
	public static void main(String[] args) {
		int numer1 = 1; // 1분자
		int denom1 = 2; // 1분모
		int numer2 = 3; // 2분자
		int denom2 = 4; // 2분모
		
		// 분모들끼리 값이 같아야 계산가능(분모의 수를 각각 분자와 분모에 곱해주기)
		// 분자와 분모의 약분(분모와 분자가 더이상 나눠지지 않을때까지)
		
		int denom3 = denom1 * denom2; // 같은 분모
		numer1 = numer1 * denom2; // 분모에게 곱해준 수를 분자에도 곱해주기
		numer2 = numer2 * denom1; // 분모에게 곱해준 수를 분자에도 곱해주기
		// 덧셈 가능
		int numer3 = numer1 + numer2; // 분자끼리 더해줬다
		int max = 1; // 최대공약수(denom3와 numer3가 동시에 나누어 떨어질수 있는 수)
		for(int i = 1; i <= numer3 && i <= denom3; i++) {
			if(denom3 % i == 0 && numer3 % i == 0) {
				max = i;
			}
		}
		// 최대공약수를 나눠준다 -> 약분
		numer3 = numer3/max; 
		denom3 = denom3/max;
		int[] answer = {numer3,denom3};
		
		System.out.println(Arrays.toString(answer));
	}
}
