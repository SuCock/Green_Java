package com.ksm.userservice.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    void save(User user);

    @Insert("INSERT INTO users\n" +
            "        (user_email,user_name,user_password)\n" +
            "        VALUES\n" +
            "        (#{user_email},#{user_name},#{user_password})")
    void save2(User user);
}
