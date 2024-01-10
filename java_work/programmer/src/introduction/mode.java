package introduction;

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
		int answer = array[0];          // 배열 중 제일 첫번째 값을 maxNum으로 초기설정 -> 1
        int max = 0;                    // 값을 담기 위한 변수 초기화 -> 0
        int frequent[] = new int[1000]; // array 길이 초기설정
        
        for(int i = 0; i < array.length ; i++) {
            /* i = 0 -> array[0] -> 1   -----
               frequent[1] -> 1              |
                                        동일한 방이 두 번 발견됨
               i = 1 -> array[1] -> 1        |
               frequent[1] -> 2         -----
               
               i = 2 -> array[2] -> 2   -----
               frequent[2] -> 1              |
                                        동일한 방이 두 번 발견됨
               i = 3 -> array[3] -> 2        |
               frequent[2] -> 2        -----
            */
            frequent[array[i]]++;
            
            /* max 초기값 -> 0
               0 < frequent[0] (0) : false
               0 < frequent[1] (2) : true : { max = 2, answer = 1 };
               2 < frequent[2] (2) : false
            */
            if(max < frequent[array[i]]) {
                max = frequent[array[i]];
                answer = array[i];
            }
            // 최종 : max = 2, answer = 1;
        };
        
        int MultipleOrNot = 0;  // 여러개인지 확인하기 위한 변수 선언
        for(int i = 0 ; i < 1000 ; i++) {
            /* 2 == frequent[0] (0) : false
               2 == frequent[1] (2) : ture
               2 == frequent[2] (2) : ture
            */
            if(max == frequent[i]) {
                // 2
                MultipleOrNot++;
            }
            // MultipleOrNot이 1보다 크면 answer 값 -1로 지정
            // 2 > 1
            if(MultipleOrNot > 1) {
                answer = -1;
            }
        };
        System.out.println(answer);
		
	}
}
