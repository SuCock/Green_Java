package com.mh.restapi05.config;

import com.mh.restapi05.jwt.TokenManager;
import com.mh.restapi05.member.Member;
import com.mh.restapi05.member.Role;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class JWTInterceptor implements HandlerInterceptor {

    private final TokenManager tokenManager;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("일로오나");
        String token = request.getHeader("Authorization");
        // 토큰이 없어도 허용한다.
        if(
                request.getRequestURI().contains("swagger")
                    || request.getRequestURI().contains("common")
                    || request.getRequestURI().contains("file")
                    || request.getRequestURI().contains("error")
                    || request.getRequestURI().contains("main")
                    || request.getRequestURI().contains("h2")
        )
        {
            return true;
        }

        // java web token(jwt)이 없거나 유효성이 확인이 안되면 예외처리로 진행을 못하도록 막는다
        if(token == null || !token.startsWith("Bearer")){
            System.out.println("token이 없습니다");
            //throw new RuntimeException("jwt 토큰 발행 후 진행해라");
            return true;
        }
        try {
            Jws<Claims> jws = tokenManager.validateToken(token.substring("Bearer ".length()));

            List<SimpleGrantedAuthority> roles = new ArrayList<>();
            roles.add(new SimpleGrantedAuthority(jws.getBody().get("role").toString()));
            System.out.println(roles);


            // 로그인한 사람 정보를 authentication에 저장해라
            Authentication authentication = UsernamePasswordAuthenticationToken.authenticated(
                    Member.builder()
                            .email(jws.getPayload().get("email").toString())
                            .username(jws.getPayload().get("username").toString())
                            .role(
                                    // enum은 string이 아니다 -> enum으로 형변환을 시켜줘야 한다
//                                    Role.valueOf(jws.getPayload().get("role").toString())
                                    Role.fromString(jws.getPayload().get("role").toString())
                            )
                            .id(jws.getPayload().get("id", Long.class))
                            .build(),
                    null,
                    roles
            );

            // 로그인한 사람의 정보를 저장해라
            SecurityContextHolder.getContext().setAuthentication(authentication);

        }catch (ExpiredJwtException e){
            System.out.println("토큰 만료");
            throw new RuntimeException("jwt 만료");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("토큰 검증 실패");
            throw new RuntimeException("jwt 토큰 검증 실패");
        }
        return true;
    }
}
