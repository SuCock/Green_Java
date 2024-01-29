package org.example.util;

import org.example.member.Member;

public class Login {
    // DBMember 담는다
    public static Member member;
    // 로그인 여부 저장
    public static boolean login;
    public static String getRole(){
        return member.getRole();
    }
    public static String getName(){
        return member.getName();
    }
}
