package basic;

import java.util.Arrays;
import java.util.Scanner;

public class change {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        char[] aa = a.toCharArray();
        for (int i = 0; i < aa.length; i++) {
        	if( aa[i] >= 65 && aa[i] <= 90) {
        		aa[i] = (char) (aa[i]+32);
        	}else if( aa[i] >= 97 && aa[i] <= 122) {
        		aa[i] = (char) (aa[i]-32);
        	}
        	
        }
       
       System.out.println(String.valueOf(aa));
	}
}
