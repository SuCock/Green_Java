package com.mh.restapi05.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// MemberService는 UserDetailsService다.(is-a관계)
// 그러므로 spring security에서 자동으로 등록해서 사용해야한다.
@Service
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;

    // 저장하는 메서드
    // email 중복체크 -> 에러로 빠집니다
    public Member save(Member member){

        Optional<Member> optionalMember = memberRepository.findByEmail(member.getEmail());
        
        if(optionalMember.isPresent()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
        
        return memberRepository.save(member);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        memberRepository.findByEmail(email);
        System.out.println("일로오나?");
        return null;
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
