package ex02;

public class Ex03 {
	public static void main(String[] args) {
//		// 정수 선언
//		short k  = 20;
//		int a = 10;
//		// 실수 선언
//		float b = 20.2f; // float는 f를 붙여줘야한다.
//		double c = 20.33d; // double는 d를 붙여줘야한다.
//		
//		// 문자 문자열 선언
//		char d = 'A'; // 문자 선언은 작은 따옴표
//		String e = "안녕하세요"; // 문자열은 큰 따옴표
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(k);
//		
		int n = 3;
		String my_string = "Hello";
		String answer = "";
        for(int i = 0; i<my_string.length(); i++){
           char aaa = my_string.charAt(i);
            for(int j = 0; j<n; j++){
             answer += aaa;   
            }
        }
        System.out.println(answer);
	}
}

	
