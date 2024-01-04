package ch03;
class OperatorEx2 {
	public static void main(String args[]) {
		int i=5, j=0;

		j = i++;
		System.out.println("j=i++;, i=" + i +", j="+ j); // 후에 증가

		i=5;        
		j=0;

		j = ++i;
		System.out.println("j=++i;, i=" + i +", j="+ j); // 선 증가
	}
}
