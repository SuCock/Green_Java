package com.mh.mybatisTest.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberRepository {
    public void insert();

}
