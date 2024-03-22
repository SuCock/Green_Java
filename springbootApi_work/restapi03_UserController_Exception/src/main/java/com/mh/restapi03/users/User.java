package com.mh.restapi03.users;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Schema(description = "Usre Table에 대한 내용입니다.")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema( title = "사용자 ID", description = "table에서 자동으로 증가하는 컬럼")
    private Long id;

    @Column(length = 50)
    @Schema( title = "사용자 이름", description = "사용자 이름을 적는 곳입니다ㅊ")
    private String username;

    @Column(length = 50, unique = true)
    private String email;

    @JsonIgnore // json에 안넘기겠다
    private String password;

    // @Enumerated(EnumType.ORDINAL) male = 0 , female = 1
    // @Enumerated(EnumType.STRING) => Male,feMale
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime wdate;

}