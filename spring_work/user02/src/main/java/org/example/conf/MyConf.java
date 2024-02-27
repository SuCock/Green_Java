package org.example.conf;

import org.example.component.AA;
import org.example.component.AABBService;
import org.example.member.MemberDAO;
import org.example.member.MemberService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.example.member", "org.example.component"}) // 이경로에 있는거면 bean을 안써도 객체주입, 가지고 오는 곳에도 @component를 추가 해줘야한다
public class MyConf {

//    @Bean
//    @Qualifier("memberservice1") // 식별자
//    public org.example.user.MemberService memberservice1(){
//        return new org.example.user.MemberService();
//    }

//    @Bean
//    @Qualifier("memberservice2") // 식별자
//    public org.example.member.MemberService memberservice2(){
//        return new org.example.member.MemberService();
//    }
//
//    @Bean
//    public MemberDAO memberDAO(){
//        return new MemberDAO();
//    }

//    @Bean
//    public AABBService aabbService(){
//        return new AABBService();
//    }
//
//    @Bean AA aa(){
//        return new AA();
//    }
}
