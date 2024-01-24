package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 자식객체는 부모객체를 담을 수 있다.
        // 부목객체는 자식객체를 참조할 수 있다.
//        Friend[] f = new Friend[5];
//
//        f[0] = new UniFriend("홍길동", "컴공", "01099266624");
//        f[1] = new CompFriend("회사친구", "개발자", "01012341324");
//
//        System.out.println(f[0]);
//        System.out.println(f[1]);

        List<Friend> list = new ArrayList<>();
        list.add(new UniFriend("홍길동", "컴공", "010123465"));
        list.add(new CompFriend("회사친구", "개발자", "01044567894"));

        System.out.println(list);
    }
}