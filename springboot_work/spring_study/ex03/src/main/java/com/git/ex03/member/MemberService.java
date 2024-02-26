package com.git.ex03.member;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

@Data
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public void regist(Member member) {
        memberRepository.insert(member);
//        return member;
    }

    public void list() {
        Collection<Member> collection = memberRepository.select();
        System.out.println("확인 Service");
        collection.stream().forEach(System.out::println);
    }
}
