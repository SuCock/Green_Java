package ex07;

public class Ex08 {
	public static void main(String[] args) {
		aa:for(int a = 0; a < 5; a++) { // 컨티뉴 라벨링 
			
			for(int i = 0; i < 5; i++) {
				if(i == 2) {
					continue aa; // 2가 나올떄는 통과(aa:로 간다)
				}
					System.out.print(i);
			}
			System.out.println();
		}
	}
}
