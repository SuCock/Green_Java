package com.git.ex03.member;

import com.git.ex03.component.AA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@Controller
public class MemberController {
    @Autowired
    MemberService memberService;
    @Autowired
    AA aa;

    @GetMapping("aa")
    public String aa(Model model){
        System.out.println(aa);

        String a = "안녕하세요";
        model.addAttribute("hi", a);

        System.out.println(memberService);
        return "aa";
    }

    @GetMapping("list")
    public String list(){
        memberService.list();
        System.out.println("확인 Controller");
        return "list";
    }

    @GetMapping("regist")
    public String regist(){

        Member member = Member.builder()
                .email("aaa@naver.com")
                .localDate(LocalDate.now())
                .password("1234")
                .build();

        memberService.regist(member);
        return "regist";
    }


}
