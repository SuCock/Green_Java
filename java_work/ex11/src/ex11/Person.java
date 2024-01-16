package ex11;

/*
 * 연락처 관리 프로그램
 */

public class Person {
	
	String name;
	String phone;
	String gender;
	String remark;
	int age;
	
	public void initValue(String name, int age String gedner) {
		this.name = name;
		this.age = age;
		this.gender = genmder;
	}
	// 생성자
	public Person() {
//		System.out.println("기본 생성자");
	}
	
	// name, phone, gender, remark를 설정하는 메서드
	public void setPerson(String name, String phone, String gender, String remark) {
		this.name = name; // this를 붙이면 현재 클래스의 변수를 가르킨다.
		this.phone = phone;
		this.gender = gender;
		this.remark = remark;
	}
	
	// 메서드
	@Override
	public String toString() {
		return "Person [name=" + name + ", "
				+ "phone=" + phone + ", "
				+ "gender=" + gender + ", "
				+ "remark=" + remark + "]";
	}
	
//	public String toString() {
//		return "Person" + name + phone + gender + remark;
//	}
	
}
