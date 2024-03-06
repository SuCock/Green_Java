package com.mh.restapi03.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User regist(User user){
        User dbuser = userRepository.save(user);
        return dbuser;
    }

}
