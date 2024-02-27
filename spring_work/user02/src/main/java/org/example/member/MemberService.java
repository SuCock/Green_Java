package org.example.member;

import org.example.component.AABBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MemberService {
    @Autowired
    @Qualifier("aabb")
    AABBService aabbService;

    // 자동 객체 주입
    @Autowired
    MemberDAO memberDAO;

    // member Map 등록하러
    public void Regist(Member member){
        memberDAO.insert(member);
    }

    // 내용출력
    public void list(){
        Collection<Member> collection = memberDAO.select();
        collection.forEach(System.out::println);
    }
}
