package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {
    public void doA(){
        try {
            int[] arr = new int[10];
            arr[11] = 10;
            Scanner sc = new Scanner(System.in);

            System.out.println("숫자를 입력해주세요 > ");
            int a = sc.nextInt();

            System.out.println("숫자를 입력해주세요 > ");
            int b = sc.nextInt();

            System.out.println("a / b = " + a / b);
            System.out.println("end of try");
            return; // return으로 함수가 종료되도 finally를 간다.
        }catch (ArithmeticException ae){
            System.out.println("0으로 나눌 수 없습니다ㅜㅜ");
        }catch (InputMismatchException ime){
            System.out.println("문자 입력하시면 안되요ㅜㅜ");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("모든 예외");
        }finally {
            System.out.println("Good Bye");
        }
    }
    public static void main(String[] args) {
        Main4 main4 = new Main4();
        try {
            main4.doA();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("강제종료되어서 여기 실행 안됨");
    }
}
