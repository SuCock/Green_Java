package com.git.ex03.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberRepository {

    Map<String, Member> map = new HashMap<>();

    public void insert(Member member) {
        map.put(member.getEmail(), member);
        System.out.println("확인");
    }

    public Collection<Member> select() {
        //Set<String> Keys = map.KeySet();
        System.out.println("확인 Repository");
        return  map.values();
    }
}
