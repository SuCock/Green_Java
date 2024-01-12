package basic;

public class stringChange {
	public static void main(String[] args) {
		String[] arr = {"a","b","c"};
		String answer = "";
		
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		System.out.println(answer);
	}
}
