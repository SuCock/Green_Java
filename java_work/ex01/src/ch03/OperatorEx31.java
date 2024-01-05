package ch03;
class OperatorEx31 {
	public static void main(String[] args) {
		int dec  = 1234; 
		int hex  = 0xABCD;
		int mask = 0xF;

		System.out.printf("hex=%X%n", hex);
		System.out.printf("%X%n", hex & mask); // 전자개발에서 쓴다(2진법이나 16진법이 편함)
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
	} // main�� ��
}
