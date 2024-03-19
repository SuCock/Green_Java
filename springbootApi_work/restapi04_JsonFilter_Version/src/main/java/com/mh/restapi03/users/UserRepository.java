package com.mh.restapi03.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    // findAll(), save(), findById(), delete(), deleteAll()

    // select * from user where email = ?;
    public User findByEmail(String email);

    // select * from user where email = ? and password = ?
    public User findByEmailAndPassword(String email, String password);

    // select * from user where username like '%길동%'
    // 자동으로 유저이름이 길동인걸 찾아준다
    public List<User> findByUsernameContainingOrEmailContaining(String username, String email);
}
