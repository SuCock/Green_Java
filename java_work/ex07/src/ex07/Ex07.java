package ex07;

public class Ex07 {
	public static void main(String[] args) {
		int [] array = {1,2,3,3,3,4};
		int [] array2 = {1,1,2,2};
		int [] array3 = {1};
		int [] realArr = new int [array.length]; // 비교가 끝난 수를 넣는 곳?
		int [] cntArr = new int [array.length]; // 
		int result = 0;
		int rcnt = 0;
		
		// 시작하기전에 realArr에 있는거는 비교조차 안해야함.
		for(int i = 0;i < realArr.length; i++) {
			int count = 0;
			for(int j = 0;j < realArr.length; j++) {
				if(array[i] == realArr[j]) {  // 하나라도 같은게 있으면 count증가
					count++;
				}
			}
			if(count == 0) {
				realArr[rcnt++] = array[i]; // 카운트의 양이 하나라도 증가되면 
			}
		}
		rcnt = 0;
		// 비교하는 for문
		for(int i = 0;i < realArr.length; i++) {
			int count = 0;
			for(int j = 0;j < realArr.length; j++) {
				if(realArr[i] == array[j]) {
					count++;
				}
			}
			cntArr[rcnt++] = count-1;
		}
		int max = cntArr[0];
		for(int i = 1; i<cntArr.length; i++) {
			if(max < cntArr[i]) {
				max = cntArr[i];
			}
		}
		for(int i = 0; i<cntArr.length; i++) {
			if(cntArr[i] == 0 || cntArr[i] == -1) {
				continue;
			}
		}
		System.out.println("최빈값은 = " + max + "입니다.");
		// realArr 출력하는 부분
//		for(int i = 0; i < cntArr.length; i++) {
//			System.out.println(cntArr[i]);
//		}
		
		int answer = 0;
		System.out.println(answer);
	}
}
