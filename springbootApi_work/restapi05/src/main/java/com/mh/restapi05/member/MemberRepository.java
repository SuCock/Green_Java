package com.mh.restapi05.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // select * from member where email = ?
    // 해당하는 이메일이 있는지 확인(있으면 중복)
    Optional<Member> findByEmail(String email);

    Member findByEmailAndPassword(String email, String password);

    List<Member> findAll();
}
