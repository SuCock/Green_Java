package com.mh.restapi05.main.member;

import com.mh.restapi05.member.Member;
import com.mh.restapi05.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MainMemberService implements UserDetailsService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    // 스프링 시큐리티로 로그인하면 이쪽으로 온다
    // import org.springframework.security.core.userdetails.User;
    // import org.springframework.security.core.userdetails.UserDetails;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        System.out.println("일로오나 " + email);
        Optional<Member> optionalMember = memberRepository.findByEmail(email);
        System.out.println(optionalMember);
        if(optionalMember.isEmpty()){
            System.out.println("해당하는 사용자가 없습니다.");
        }

        Member member = optionalMember.get();
        return User.builder()
                .username(member.getEmail())
                // 비번은 1234만 적어도 로그인된다
//                .password(passwordEncoder.encode("1234"))
                // 로그인창에서 치는 비번을 암호화로 바꾼뒤 비교함으로 디비에 있는것을 암호화를 다시 풀필요없다.
                .password(member.getPassword())
                .roles(member.getRole().toString())
                .build();
    }
}
