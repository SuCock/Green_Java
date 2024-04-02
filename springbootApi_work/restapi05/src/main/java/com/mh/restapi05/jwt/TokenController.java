package com.mh.restapi05.jwt;

import com.mh.restapi05.member.Member;
import com.mh.restapi05.member.MemberRepository;
import com.mh.restapi05.member.Role;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpHeaders;

@RestController
@RequiredArgsConstructor
public class TokenController {

    private final TokenManager tokenManager;
    private final MemberRepository memberRepository;

    @GetMapping("/auth")
    public String loginTest(Authentication authentication){
        System.out.println(authentication);
        // 로그인 되어있나
        System.out.println(authentication.isAuthenticated());
        // jws.getPayload().get("username") 가져오는 이름
        System.out.println(authentication.getPrincipal());
        return "loginTest";
    }

    @PostMapping("/token")
    public String token(@RequestBody TokenDto tokenDto){
        System.out.println("email = " + tokenDto.getEmail());
        System.out.println("password = " + tokenDto.getPassword());
        Member dbmember = memberRepository.findByEmailAndPassword(tokenDto.getEmail(), tokenDto.getPassword());
        if(dbmember == null){
            throw new RuntimeException("회원가입이 안되어져 있습니다.");
        }
        return tokenManager.generateToken(dbmember);
//        Member member = Member.builder()
//                .email("aaa@naver.com")
//                .id(1l)
//                .username("홍길동")
//                .role(Role.USER)
//                .build();
//        return tokenManager.generateToken(dbemeber);
    }
}
