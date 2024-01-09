package programmer;

import java.util.Arrays;

/*
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
 * 정수 배열 array가 매개변수로 주어질 때, 
 * 최빈값을 return 하도록 solution 함수를 완성해보세요. 
 * 최빈값이 여러 개면 -1을 return 합니다.
 */

public class mode {
	public static void main(String[] args) {
		int [] array = {1,1,2,2};
		int [] countA = new int [array.length];// 숫자의 갯수들을 저장할곳
		int count = 0;
		int temp = 0;
		int answer = 0;
		Arrays.sort(array);
		// sort정렬
		// 최빈값이 복수로 들어간다는 가정을 할려면 배열에 담아서 -1을 리턴해야한다
		// 중복되는 수를 카운팅해서 같아지면 -1를 리턴한다
		// for문을 두개 사용해서 배열의 숫자들의 갯수를 새로운 배열에 넣어준다
		for( int i = 0; i < array.length; i++) {
			for(int j = i; j < array.length+1; j++) {
				if(array[i] == array[j]) {
					temp = array[i];
					System.out.println(temp);
				}
			}
			countA[i] = temp;
			System.out.println(Arrays.toString(countA));
				
		}
		
	}
}
