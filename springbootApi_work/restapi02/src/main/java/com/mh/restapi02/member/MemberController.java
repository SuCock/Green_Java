package com.mh.restapi02.member;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    //@Autowired
    private final MemberRepository memberRepository;

    // select
    @GetMapping("member")
    public List<Member> allMember(){
        // findAll을 써서 list에 맴버 객체를 담는다
        // select 구문이 실행된다
        List<Member> list = memberRepository.findAll();
        System.out.println(list);

        return list;
    }

    // insert
    @PostMapping("member")
    public Member memberSave(String username, String email){
        System.out.println("username = " + username);
        System.out.println("email = " + email);
        Member member = Member.builder()
                .username(username)
                .email(email)
                .build();
        Member dbMember = memberRepository.save(member);

        return dbMember;
    }

    // update
    @PutMapping("member")
    public Member update(Long id, String username, String email){

        Member member = Member.builder()
                .id(id)
                .username(username)
                .email(email)
                .build();
        Member dbMember = memberRepository.save(member);

        return dbMember;
    }

    // delete
    @DeleteMapping("member")
    public String  delte(Long id){
       memberRepository.deleteById(id);

        return "deleted id = " + id;
    }

}
