// 로또 만들기
// 코드 리뷰 날짜
// 2주에 한번씩

public class Main {
    public static void main(String[] args) {
        int[] lottoNumber = new int[7];
        int counter = 0;

        // 입력하는 for문
        // 1번째 부터 비교해라
        // 0번 ~ 현재 번호까지 비교하면서 같은게 있으면 counter 증가해라
        // 똑같은게 없을떄까지 해라
//        for (int i = 0; i < lottoNumber.length; i++) {
//            lottoNumber[i] = (int) (Math.random() * 46) + 1;
//            counter = -1;
//
//            while(true){
//                counter = 0;
//                for (int j = 0; j < i; j++) {
//                    if(lottoNumber[i] == lottoNumber[j]){
//                        counter++;
//                    }
//                }
//                if(counter > 0){
//                    lottoNumber[i] == (int) (Math.random() * 45) + 1;
//                }
//                System.out.println("counter = " + counter);
//            }
//            }
//
//
//        // 출력하는 for문
//        for (int j = 0; j < lottoNumber.length; j++) {
//        }
    }
}