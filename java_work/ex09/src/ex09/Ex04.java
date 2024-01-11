package ex09;

import java.util.Arrays;

/*
 * 버블정렬(오름차순)
 * 1회전
 * {100,90,60,40,120}
 * 100과 90을 비교해서 100이 더큼으로 뒤로 보낸다 -> {90,100,60,40 120}
 * 계속 반복 -> {90,60,100,40,120}
 * {90,60,40,100,120} -> 여기까지 1회전(처음으로 비교하는 숫자가 제자리를 가면)
 * 
 * 2회전
 * {60,90,40,100,120}
 * {60,40,90,100,120} -> 여기까지 2회전
 * 
 * 3회전
 * {40,60,90,100,120} -> 여기까지 3회전
 */

public class Ex04 {
	public static void main(String[] args) {
		int [] arr = {100,90,60,40,120};
		
		for(int i = 0; i < arr.length - i; i++) { // 100을 뒤로 보내면 그 앞에까지만 비교하도록
			for(int j = 0; j < arr.length - j; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[i];
					arr[i] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
