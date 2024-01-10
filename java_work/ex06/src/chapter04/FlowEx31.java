package chapter04;
class FlowEx31 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%3==0) {
				System.out.println(i + "가 뭐 일때 coutinue 됨");
				continue;
			}
//			System.out.println(i);
		}
	}
}
