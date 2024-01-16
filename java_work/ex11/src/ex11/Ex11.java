package ex11;

public class Ex11 {
	public static void main(String[] args) {
		hiEveryone("홍길동", 12, "남자");
		
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.gender = "여자";
		
		hiEveryone(p1);
	}

	static void hiEveryone(Person p) {
		System.out.println("안녕하세요 " + p.name + "님");
		System.out.println("저는 " + p.age + "살 입니다.");
		System.out.println("성별은 " + p.gender + " 입니다");
	}
	
	static void hiEveryone(String name, int age, String gender) {
		System.out.println("안녕하세요 " + name + "님");
		System.out.println("저는 " + age + "살 입니다.");
		System.out.println("성별은 " + gender + " 입니다");
	}
}
