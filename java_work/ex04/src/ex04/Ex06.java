package ex04;

public class Ex06 {
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		
		byte c = (byte)(a * b);
		System.out.println(c); // a와 b를 곱하면 300 -> 바이트크기를 넘으니깐 44
	}
}	
