package ex11;

public class Ex03 {
	// 배열을 선언하고 
	// 배열을 정렬하고 
	// 배열의 모든값을 더해서 출력
	// 메서드를 이용해서
	Ex03(){
		int arr[] = new int[] {10, 5, 20, 11, 2};
		
		ArrayU myU = new ArrayU();
		myU.sort(arr);
		myU.print(arr);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
