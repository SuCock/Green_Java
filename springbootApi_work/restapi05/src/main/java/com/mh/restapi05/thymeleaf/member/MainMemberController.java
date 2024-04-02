package com.mh.restapi05.thymeleaf.member;

import com.mh.restapi05.member.Member;
import com.mh.restapi05.member.MemberDto;
import com.mh.restapi05.member.MemberRepository;
import com.mh.restapi05.member.Role;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/main")
@RequiredArgsConstructor
public class MainMemberController {

    private final MemberRepository memberRepository;

    @GetMapping("/member")
    public String member(Model model){
        List<Member> memberList = memberRepository.findAll();
        model.addAttribute("list", memberList);
        return "member/member";
    }

    @GetMapping("/join")
    public String join(){
        return "member/join";
    }

    @PostMapping("/join")
    public String joinInsert(MemberDto memberDto){
        memberRepository.save(
            Member.builder()
                    .username(memberDto.getUsername())
                    .password(memberDto.getPassword())
                    .email(memberDto.getEmail())
                    .role(Role.USER)
                    .build()
        );
        return "redirect:/main/member";
    }

    @GetMapping("/login")
    public String login(MemberDto memberDto){

        return "member/login";
    }
}
