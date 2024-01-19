package ex14;

public class Person {
	private int regNum;
	private int passNum;
	
	public Person(int regNum) {
		System.out.println("regNum 생성자");
		this.regNum = regNum;
	}
	
	// 생성자
	public Person(int regNum, int passNum) {
		this(regNum);
//		this.regNum = regNum;
		this.passNum = passNum;
		System.out.println("regNum 생성자  passNum 생성자");
	}
	
	@Override
	public String toString() {
		return "Person [regNum=" + regNum + ", passNum=" + passNum + "]";
	}
}
