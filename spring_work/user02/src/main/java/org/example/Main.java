package org.example;


import org.example.conf.MyConf;
import org.example.member.Member;
import org.example.member.MemberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);

//        String[] str = context.getBeanDefinitionNames();
//        Arrays.stream(str).forEach(item -> System.out.println(item));


        Member member1 = Member.builder()
                .email("aaa@naver.com")
                .password("qwer")
                .name("홍길동")
                .wdate(LocalDateTime.now())
                .build();

        Member member2 = Member.builder()
                .email("bbb@naver.com")
                .password("asdf")
                .name("김길동")
                .wdate(LocalDateTime.now())
                .build();

        MemberService memberService = context.getBean(MemberService.class);
        memberService.Regist(member1);
        memberService.Regist(member2);

        memberService.list();

//        int[] arr = {10, 20, 30, 40};
//        for(int temp : arr){
//            System.out.println(temp);
//        }
//        Arrays.stream(arr).forEach(System.out::println);
//
//        System.out.println();
//
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");
//
//        System.out.println(formatter.format(now));

        context.close();
    }
}