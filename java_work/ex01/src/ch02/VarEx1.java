package ch02;

class VarEx1 {
	public static void aa() {
		
	} // 클래스 안에 aa
	public static void bb() {
		
	} // 클래스 안에 bb
	public static void main(String[] args) {
		int year = 0;
		int age  = 14;
		 
		System.out.println(year);
		System.out.println(age);

		year = age + 2000;
		age  = age + 1;   

		System.out.println(year);
		System.out.println(age);
	} // 다 쓴 메모리는 운영체제에게 메모리를 돌려준다
}
