package com.mh.restapi05.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("")
    public String getmember(){
        return "memberSelect";
    }

    @PostMapping("")
    public String postmember(@Valid @RequestBody MemberDto memberDto){
        System.out.println("memberDto = " + memberDto);
        Member member = new Member();

        BeanUtils.copyProperties(memberDto, member);
        memberService.save(member);
        return "memberInsert";
    }
}
