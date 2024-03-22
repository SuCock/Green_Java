package com.mh.restapi05.jwt;

import com.mh.restapi05.member.Member;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

import static io.jsonwebtoken.security.Keys.hmacShaKeyFor;

@Component
public class TokenManager {

    @Value("${spring.jwt.secret}")
    private String mykey;

    // 토큰 발급해주는 함수
    public String generateToken(Member member){
        return Jwts.builder()
                .subject("ksmtoken")
                .claim("id", member.getId())
                .claim("username", member.getUsername())
                .claim("role", member.getRole())
                .claim("email", member.getEmail())
                // 유효시간 1000 * 60 * 60 * 10 = 10시간
                // 유효시간 1000 * 60 * 15 = 15분
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 15))
                .signWith(hmacShaKeyFor(mykey.getBytes()))
                .compact();
    }
    
    // 토큰 검증해주는 함수
    public Jws<Claims> validateToken(String token){
        Jws<Claims> jws = Jwts.parser() // 번역해라
                .setSigningKey(hmacShaKeyFor(mykey.getBytes())) // 비밀번호로
                .build() // 객체 생성하고
                .parseClaimsJws(token); // claim들을 번역해서 컬렉션 타입으로 만들어라

        System.out.println(jws);

        return jws;
    }
}
