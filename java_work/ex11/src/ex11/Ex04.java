package ex11;

/*
 * import java.lang.*;
 * 기본생성자
 * toString()
 */

public class Ex04 {
	public static void main(String[] args) {
		Data d1 = new Data();
		System.out.println(d1);
		System.out.println(d1.toString());
		
		Data d2 = copy(d1);
		
		System.out.println(d2);
		
		d2.x = 100;
		System.out.println(d1);
	}
	
	// static이 아니면 인스턴스화 해야한다 
	static Data copy(Data d) {
		Data data = new Data();
		return data;
	}
}

class Data{
	int x = 10;
	
	@Override
	public String toString() {
		return "Data [x=" + x + "]";
	}
}
