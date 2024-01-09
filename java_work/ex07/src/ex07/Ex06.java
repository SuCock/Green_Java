package ex07;

public class Ex06 {
	public static void main(String[] args) {
		int [] arr = {10, 20, 30, 40, 50};
		
		String a= "abcdef";
		System.out.println(a.length());
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
			System.out.println();
			
			for(int temp: arr) {
				System.out.println(temp);
			}
			System.out.println();
			
			String[] arr1 = {"aa", "bb", "cc", "dd"};
			
			for(String temp: arr1)
				System.out.println(temp);
		}
	}
}
