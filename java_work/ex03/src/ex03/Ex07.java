package ex03;

public class Ex07 {
	public static void main(String[] args) {
		char aa = 'A';
		System.out.println(aa);
		// int로 형변환
		int bb = (int)aa;
		System.out.println(bb);
		// char로 형변환
		char cc = (char)bb;
		System.out.println(cc);
		
		byte kk = 127;
		System.out.println(kk+1); // int형 연산
		System.out.println((byte)(kk+1)); // 오버플로우 8bit
	}
}
