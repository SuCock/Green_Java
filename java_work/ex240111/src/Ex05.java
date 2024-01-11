/*
성적관리 프로그램
번호 이름 국어 영어 수학
[0]["홍길동"[100,80,90]
[1]["이길동"[70,90,100]
[2]["박길동"[80,70,200]
 */
public class Ex05 {
    public static void main(String[] args) {
        String[] student1 = {"홍길동","80","90","100"};
        String[] student2 = {"이길동","70","60","80"};
        String[] student3 = {"박길동","100","90","40"};

        String[][] all = {student1,student2,student3};

        int korSum = 0;
        int engSum = 0;
        int mathSum = 0;

        System.out.println("학생의 숫자 = " + all.length + "명");

        // 학생의 숫자, 학생들 국어평균점수, 영어평균점수, 수학평균점수
        // 모든 점수의 평균점수, 1,2,3등 구하기


        for (int i = 0; i < all.length; i++) {
            korSum += Integer.parseInt(all[i][1]);
            engSum += Integer.parseInt(all[i][2]);
            mathSum += Integer.parseInt(all[i][3]);
        }
        System.out.println("국어점수의 총합 = " + korSum);
        System.out.println("국어점수의 평균 = " + korSum / all.length);

        System.out.println("영어점수의 총합 = " + engSum);
        System.out.println("영어점수의 평균 = " + engSum / all.length);

        System.out.println("수학점수의 총합 = " + mathSum);
        System.out.println("수학점수의 평균 = " + mathSum / all.length);

        System.out.println("모든점수의 평균");
        System.out.println((korSum + engSum + mathSum) / 9);
    }
}
