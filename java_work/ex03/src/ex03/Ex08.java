package ex03;

// 실수 -> 정수
// double의 소수점을 버리고 형변환

public class Ex08 {
	public static void main(String[] args) {
		double d = 85.4d;
		int score = (int) d;
		System.out.println("score = " + score);
		System.out.println("d = " + d);
		
		// 비트 체계가 작은거에서 큰걸로 바꿀때는 자료의 소실이
		// 없기 때문에 안적어도 자동 형변환 됩니다.
		int aa = 10;
		double ee = aa;
		System.out.println("aa = " + aa);
		System.err.println("ee = " + ee);
	}
}
