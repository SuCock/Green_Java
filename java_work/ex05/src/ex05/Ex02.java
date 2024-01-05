package ex05;

public class Ex02 {
	public static void main(String[] args) {
		char a = 'a'; 
		int i = 0;
        for(; i<26; i++) {          // i가 0부터 25까지
        	System.out.println(i + "\t" + a++); 
        } 
        
		System.out.println(i);
		
        a = 'A';
        for( ; i<26; i++) {
        	System.out.println(i + "\t" + a++);
        }
	}
}
