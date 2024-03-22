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
        // jws.getPayload().get("username") 가죠오는 이름
        System.out.println(authentication.getPrincipal());
        return "loginTest";
    }

    @PostMapping("/token")
    public String token(@RequestBody TokenDto tokenDto){
        System.out.println("email = " + tokenDto.getEmail());
        System.out.println("password = " + tokenDto.getPassword());
        Member dbemeber = memberRepository.findByEmailAndPassword(tokenDto.getEmail(), tokenDto.getPassword());
        if(dbemeber == null){
            throw new RuntimeException("회원가입이 안되어져 있습니다.");
        }
        return tokenManager.generateToken(dbemeber);
//        Member member = Member.builder()
//                .email("aaa@naver.com")
//                .id(1l)
//                .username("홍길동")
//                .role(Role.USER)
//                .build();
//        return tokenManager.generateToken(dbemeber);
    }

    @GetMapping("/valid")
    public String valid(HttpServletRequest request){
        String auth = request.getHeader("Authorization");
        System.out.println(auth);
//        tokenManager.validateToken("eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJrc210b2tlbiIsImlkIjoxLCJ1c2VybmFtZSI6Iu2Zjeq4uOuPmSIsInJvbGUiOiJVU0VSIiwiZW1haWwiOiJhYWFAbmF2ZXIuY29tIiwiZXhwIjoxNzEwOTg0MTUxfQ.6COjpMDV9ku9OjH9E05TJCyVq1xzE80fiuBUrot55edxeV9fz_fQo0xn81bHQiDh");
        return "valid";
    }
}
