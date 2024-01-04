package ch03;
class OperatorEx12 { 
      public static void main(String[] args) { 
            char c1 = 'a';        // a의 코드값 97. 
            char c2 = c1;         // c1�� ����Ǿ� �ִ� ���� c2�� ����ȴ�. 
            char c3 =' ';         // c3�� �������� �ʱ�ȭ �Ѵ�. 

            int i = c1 + 1;       // 'a'+1 �� 97+1 �� 98

            c3 = (char)(c1 + 1); 
            c2++; // c2 = c2 + 1; c2 = 97 + 1; -> c2 = 98
            c2++; 

            System.out.println("i=" + i); 
            System.out.println("c2=" + c2); 
            System.out.println("c3=" + c3); 
      } 
} 
