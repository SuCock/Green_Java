package com.mh.restapi05.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebMvcConfig {
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//        // 스프링 부트 2버전에서는
//        http.csrf(csrf -> csrf.disable());
//
//        // 스프링 부트 3버전 이상부터는 람다문법을 써야지만 에러가 안난다ㅡㅡ+
//        // post방식과 put방식, delete방식을 사용할 때 csrf토큰을 사용하지 않겠다.
        http.csrf(qwe -> qwe.disable());

        http

                .authorizeRequests(
//                        req -> req.requestMatchers("/member", "/test", "/token", "/valid").permitAll() // 이경로는 모두 허용한다
//                                .anyRequest().authenticated()
                        req -> req.anyRequest().permitAll() // 모든요청
                );

                // 스프링시큐리티에서 필터다는 법
//                http.addFilter(filter);
        return http.build();
    }

//    @Bean
//    public UserDetailsService userDetailsService(){
//        // 유저 관리 하는 매니저 클래스
//        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
//
//        // 로그인 할 수 있는 유저 생성
//        UserDetails userDetails = User.withUsername("user")
//                .password(passwordEncoder().encode("1234"))
//                .roles("USER")
//                .build();
//
//        // 유저관리 하는 매니저 클래스 유저 등록
//        userDetailsManager.createUser(userDetails);
//
//        // 유저관리 하는 매니저 IOC 컨테이너에 등록 -> securityConfig에서 사용
//        return userDetailsManager;
//    }
}
