package chapter04;
import java.util.*;

class FlowEx27 {
	public static void main(String[] args) { 
		int num;
		int sum = 0;
		boolean flag = true;   


		while(flag) {    
			System.out.print(">>");

			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);  

			if(num!=0) {  
				sum += num; 
			} else {
				flag = false;   
			}
		} 

		System.out.println("sum = " + sum);
	}
}
