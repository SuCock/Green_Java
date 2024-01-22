package org.example;

import org.example.mh.MemberDB;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MemberDB md = new MemberDB();
        Scanner sc = new Scanner(System.in);

        System.out.println("이메일을 입력하세요 > ");
        String email = sc.nextLine();
        System.out.println("주소를 입력하세요 > ");
        String addr = sc.nextLine();
        System.out.println("이름을 입력하세요 > ");
        String name = sc.nextLine();
        System.out.println("비밀번호를 입력하세요 > ");
        String password = sc.nextLine();

        md.insert(email, name, password, addr);

        md.insert(member);
    }
}