package com.ksm.userservice.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @PostMapping("add-user")
    public String addUser(@Valid @RequestBody UserDto userDto) {
        User user = new ModelMapper().map(userDto,User.class);
//        User user =
//                User.builder()
//                        .user_email("qwer@naver.com")
//                        .user_password("1234")
//                        .user_name("박길동")
//                        .build();
        userRepository.save(user);
        return "추가성공";
    }

    @PostMapping("add-user2")
    public String addUser2(@Valid @RequestBody UserDto userDto) {
        User user = new ModelMapper().map(userDto,User.class);
//        User user =
//                User.builder()
//                        .user_email("asdf@naver.com")
//                        .user_password("1234")
//                        .user_name("김길동")
//                        .build();
        userRepository.save2(user);
        return "추가성공2";
    }
}
