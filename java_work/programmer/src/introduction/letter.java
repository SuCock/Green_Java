package introduction;

public class letter {
	public static void main(String[] args) {
		String my_string = "abcdef";
		String letter = "f";
		String answer = "";
		
		// my_string을 배열로 만들어서
		// for문을 돌려서 my_string을 확인해서
		// 특정문자 letter를 조건문에 넣어서 
		// 제거
		answer = my_string.replace(letter, "");
		
		System.out.println(answer);
	}
}
