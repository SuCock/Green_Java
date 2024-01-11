import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        // 2차원배열은 1차원 배열을 묶어놓은 것이다.
        int a[] = {90,80,100};
        int b[] = {40,50,60,70};
        int [][] score = {
                {10,20,30},
                {40,50,60,70}
        };

        System.out.println(score.length);
        System.out.println(score[0].length);
        System.out.println(score[1].length);

        score[1] = a;
        System.out.println(score[1].length);

        a[0] = 300;

        System.out.println(Arrays.toString(score[1]));
        System.out.println(Arrays.deepToString(score)); // 배열안의 배열의 내용물을 볼 떄는 deep을 사용한다.
    }
}
