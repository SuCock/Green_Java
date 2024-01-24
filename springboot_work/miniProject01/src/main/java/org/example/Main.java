package org.example;

import org.example.mh.Member;
import org.example.mh.MemberDB;
import org.example.util.myCLI;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MemberDB md = new MemberDB();

        while (true) {
            int select = printMenu();

            if (select == 1) {
                md.insert();

            } else if(select == 2){
              md.login();

            } else if(select == 6){
                System.out.println("종료됩니다.");
                System.exit(0);
            }
        }
    }
    public static int printMenu() {
        System.out.println("1. 회원가입");
        System.out.println("2. 로그인");
        System.out.println("3. 물품보기");
        System.out.println("4. 장바구니");
        System.out.println("5. 주문목록");
        System.out.println("6. 종료");

        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        return menu;
    }
}