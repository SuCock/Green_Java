package com.git.ex03.conf;

import com.git.ex03.member.MemberRepository;
import com.git.ex03.member.MemberService;
import com.git.ex03.myano.ManulBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

// 환경설정파일
@Configuration
@ComponentScan(value = "aa.bb.cc"
        , excludeFilters = {
            @ComponentScan.Filter(type = FilterType.ANNOTATION
            , classes = ManulBean.class) // 어노테이션타입으로 등록할거라서 IOC컨테이너 안에 등록하지마
        })
public class MyConf {
    @Bean
    public MemberService memberService(){
        return new MemberService();
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemberRepository();
    }


}
