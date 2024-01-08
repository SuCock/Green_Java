
package chapter04;
class FlowEx13 {
	public static void main(String[] args) { 
		int sum = 0;	

		for(int i=1; i <= 10; i++) {
			sum += i ;	
			System.out.printf("i들의 총 합", i, sum);
		}
	} 
}
