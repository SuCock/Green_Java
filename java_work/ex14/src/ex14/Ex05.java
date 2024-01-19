package ex14;

public class Ex05 {
	public static void main(String[] args) {
		String a = "abc";
		String d = "def";
		
		System.out.println(a + d);
		System.out.println(a.concat(d));
		
		System.out.println(a.substring(1));
		System.out.println("abcdefg".substring(0,4));
		
		String c = "abcdefg";
		String b = "abcdefg";
		
		System.out.println(c.compareTo(b));
		System.out.println("A".compareTo("B"));
		System.out.println("B".compareTo("A"));
	}
}
