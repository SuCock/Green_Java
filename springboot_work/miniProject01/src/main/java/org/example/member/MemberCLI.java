package org.example.member;

import java.util.Scanner;

public class MemberCLI {
    public Member inputMember(){
        Scanner sc = new Scanner(System.in);
        System.out.println("이메일을 입력하세요 > ");
        String email = sc.nextLine();
        System.out.println("주소를 입력하세요 > ");
        String addr = sc.nextLine();
        System.out.println("이름을 입력하세요 > ");
        String name = sc.nextLine();
        System.out.println("비밀번호를 입력하세요 > ");
        String password = sc.nextLine();


        return Member.builder()
                .email(email)
                .password(password)
                .name(name)
                .address(addr)
                .build();
    }
    public Member loginMember(){
        Scanner sc = new Scanner(System.in);
        System.out.println("이메일을 입력하세요 > ");
        String email = sc.nextLine();
        System.out.println("비밀번호를 입력하세요 > ");
        String password = sc.nextLine();


        return Member.builder()
                .email(email)
                .password(password)
                .build();
    }
}
