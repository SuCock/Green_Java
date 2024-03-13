package com.mh.restapi03.users;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

// User -> AdminUser 복사하겠다.
// 해당되는 변수가 있어야한다.
@ToString
@Getter
@Setter
@JsonFilter("AdminUser")
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema( title = "사용자 ID", description = "table에서 자동으로 증가하는 컬럼")
    private Long id;

    @Column(length = 50)
    @Schema( title = "사용자 이름", description = "사용자 이름을 적는 곳입니다")
    private String username;

    @Column(length = 50, unique = true)
    private String email;

    private String password;

    // @Enumerated(EnumType.ORDINAL) male = 0 , female = 1
    // @Enumerated(EnumType.STRING) => Male,feMale
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime wdate;

}
