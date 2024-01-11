package ex09;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		int[] arr = new int [10];
		int counter = 0;
		int tNum = 0;
		int[] cnt_arr = new int [10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		AA.doA();
		
		for(; tNum < 10; tNum++) {
			for(int i = 0; i < 10; i++) {
				if(tNum == arr[i]) {
					counter++;
				}
			}
			cnt_arr[tNum] = counter;
			counter = 0;
		}
		System.out.println(Arrays.toString(cnt_arr));
	}
}

class AA{
	public static void doA() {
		System.out.println("AA.doA() 메서드 입니다.");
	}
}
