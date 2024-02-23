package org.example;


import org.example.conf.MyConf;
import org.example.member.MemberDTO;
import org.example.member.MemberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static  AnnotationConfigApplicationContext acac = null;

    public static void main(String[] args) {
        acac = new AnnotationConfigApplicationContext(MyConf.class);
        processNewCommand(); // insert User 등록
        processListCommand(); // list  User 조회

    }

    private static void processListCommand() {
        MemberService ms = acac.getBean(MemberService.class);
        ms.list();
    }

    private static void processNewCommand() {
        // memberService객체의 빈을 가져올거다
        MemberService ms = acac.getBean(MemberService.class);

        MemberDTO md = MemberDTO.builder()
                .email("aaa@naver.com")
                .name("홍길동")
                .password("1234")
                .confirmPassword("1234")
                .build();

        if(!md.isEqualsPassword()){
            System.out.println("비밀번호를 틀렸습니다.");
            return;
        }

        ms.regist(md);
    }
}