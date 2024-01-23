package com.mh.mybatisTest.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberContorller {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping("aa")
    public String doA(){
        memberRepository.insert();
        return "aa를 돌려줄게";
    }
}
