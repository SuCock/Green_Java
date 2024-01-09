package ex07;

/*
 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
 * 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

public class Ex01 {
	public static void main(String[] args) {
		String my_string = "He11oWor1d";
		String overwrite_string = "lloWorl";
		int s = 2;
		String answer = "";
		
		System.out.println(my_string.length());
		String temp = my_string.substring(0,s) + overwrite_string;
		answer = my_string.substring(0,s) + overwrite_string + my_string.substring(temp.length());
		
		
		System.out.println(answer);
		
	}
}
