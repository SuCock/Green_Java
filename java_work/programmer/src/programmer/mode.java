package programmer;

/*
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
 * 정수 배열 array가 매개변수로 주어질 때, 
 * 최빈값을 return 하도록 solution 함수를 완성해보세요. 
 * 최빈값이 여러 개면 -1을 return 합니다.
 */

public class mode {
	public static void main(String[] args) {
		int [] array = {1,2,3,3,3,4};
		int [] count = {};
		int answer = 0;
		// 전에수와 비교해서 같으면 대입(중복되는 수가 붙어있지 않다면 어떡해 해야하지)
		// 최빈값이 복수로 들어간다는 가정을 할려면 배열에 담아서 -1을 리턴해야한다
		// 중복되는 수를 카운팅해서 같아지면 -1를 리턴한다
		for(int i = 0; i<array.length-1; i++) {
			if(array[i] == array[1+i]) {
				answer = array[i];
			}
		}
		System.out.println(answer);
	}
}
