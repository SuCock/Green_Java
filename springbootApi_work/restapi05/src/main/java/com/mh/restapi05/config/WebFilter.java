//package com.mh.restapi05.config;
//
//import com.mh.restapi05.jwt.TokenManager;
//import com.mh.restapi05.member.Member;
//import com.mh.restapi05.member.MemberRepository;
//import com.mh.restapi05.member.Role;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.ExpiredJwtException;
//import io.jsonwebtoken.Jws;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//@RequiredArgsConstructor
//public class WebFilter extends OncePerRequestFilter {
//
//    private final MemberRepository memberRepository;
//    private final TokenManager tokenManager;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        System.out.println("필터동작");
//
////        String myheader = request.getHeader("my-header");
////        System.out.println(myheader);
//        // 서버에 해당하는 email이 맞다면 그다음으로 진행하도록
//        // 이메일 체크
////        memberRepository.findByEmail(myheader);
////        if(true){
////            throw new RuntimeException("인증실패");
////        }
//
//        String token = request.getHeader("Authorization");
//        String url = request.getRequestURI();
//        System.out.println("주소 = " + url);
//        System.out.println("token = " + token);
//
//        // 이페이지에서는 token을 검사하지 않는다
//        if(url.contains("login") || url.contains("join") || url.contains("token")){
//            filterChain.doFilter(request, response);
//            return;
//        }
//
//        // java web token(jwt)이 없거나 유효성이 확인이 안되면 예외처리로 진행을 못하도록 막는다
//        if(token == null || !token.startsWith("Bearer")){
//            System.out.println("token이 없습니다");
//            throw new RuntimeException("jwt 토큰 발행 후 진행해라");
//        }
//        try {
//            Jws<Claims> jws = tokenManager.validateToken(token.substring("Bearer ".length()));
//
//
//
//            List<SimpleGrantedAuthority> roles = new ArrayList<>();
//            roles.add(new SimpleGrantedAuthority(jws.getBody().get("role").toString()));
//            System.out.println(roles);
//
//
//            // 로그인한 사람 정보를 authentication에 저장해라
//            Authentication authentication = UsernamePasswordAuthenticationToken.authenticated(
//                    Member.builder()
//                            .email(jws.getPayload().get("email").toString())
//                            .username(jws.getPayload().get("username").toString())
//                            .role(
//                                    // enum은 string이 아니다 -> enum으로 형변환을 시켜줘야 한다
////                                    Role.valueOf(jws.getPayload().get("role").toString())
//                                    Role.fromString(jws.getPayload().get("role").toString())
//                            )
//                            .id(jws.getPayload().get("id", Long.class))
//                            .build(),
//                    null,
//                    roles
//            );
//
//            // 로그인한 사람의 정보를 저장해라
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//
//            // 그다음으로 이동해서 진행해라
//            // 게시글 작성할 때 자동으로 되도록
//            filterChain.doFilter(request, response);
//
//        }catch (ExpiredJwtException e){
//            System.out.println("토큰 만료");
//            throw new RuntimeException("jwt 만료");
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("토큰 검증 실패");
//            throw new RuntimeException("jwt 토큰 검증 실패");
//        }
//
//    }
//}
