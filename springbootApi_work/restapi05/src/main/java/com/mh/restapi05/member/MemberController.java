package com.mh.restapi05.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("")
    public String getmember(Authentication authentication){
        Member member = (Member) authentication.getPrincipal();
        return "getMember email = " + member.getEmail() +
                " username : " + member.getUsername() +
                " role : " + member.getRole();
    }

    @PostMapping("/join")
    public String postmember(@Valid @RequestBody MemberDto memberDto){
        System.out.println("memberDto = " + memberDto);
        Member member = new Member();

        BeanUtils.copyProperties(memberDto, member);
        memberService.save(member);
        return "memberInsert";
    }

    @GetMapping("/memberList")
    public ResponseEntity<List<Member>> member(){
        List<Member> allMembers = memberService.getAllMembers();
        return ResponseEntity.status(HttpStatus.OK).body(allMembers);
    }
}
