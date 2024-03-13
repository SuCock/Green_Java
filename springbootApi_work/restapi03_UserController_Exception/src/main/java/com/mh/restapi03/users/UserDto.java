package com.mh.restapi03.users;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class UserDto {

    private Long id;

    @NotBlank
    private String username;
    //@Min(10) // 최소 글자의 길이가 10자리 이상이 들어와야한다
    @Size(min = 5, max = 50)
    private String email;
    //@Min(5)
    private String password;
    @NotNull // null을 허용하지 않는다
    private Gender gender;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime wdate;

    public static User of(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setGender(userDto.getGender());
        user.setWdate(LocalDateTime.now());
        return user;
    }
}
