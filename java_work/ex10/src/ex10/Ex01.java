package ex10;

/*
 * 5*5 배열에다가
 * 임의의 랜덤한 숫자를 넣어 출력해보기(1~100)
 */

public class Ex01 {
	public static void doPrintArr(int[][] arr) {
	// arr[0][0]
	// arr[0][1]
	// arr[0][2]
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				// 0<x<100
				arr[i][j] = (int) (Math.random() * 100) + 1;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arr = new int [5][5];
		int[][] brr = new int [10][10];
		doPrintArr(arr);
		doPrintArr(brr);
	}
}

