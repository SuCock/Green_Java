package programmer;

public class sheep {
	public static void main(String[] args) {
		int n = 64;
		int k = 6;
		int nResult = 0;
		int kResult = 0;
		int answer = 0;
         
		 nResult = 12000 * n;
		 kResult = (k - n/10) * 2000;
        	 
	     answer = nResult + kResult;
	     System.out.println(answer);
	     
	}
}
