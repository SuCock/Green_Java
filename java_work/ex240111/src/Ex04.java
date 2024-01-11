public class Ex04 {
    public static void main(String[] args) {
        int[][] score = {{10,20,30,50,60},{40,50,60},{70,80,90,100}};
        int sum = 0;

        // 모든 수의 합을 구하시오
        // i = 0 j = 0~2
        // i = 1 j = 0~2
        // i = 2 j = 0~2
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j <score[i].length ; j++) {
                sum += score[i][j];
            }
        }
        System.out.println(sum);
    }
}
