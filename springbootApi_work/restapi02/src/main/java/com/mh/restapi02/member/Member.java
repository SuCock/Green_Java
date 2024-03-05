package com.mh.restapi02.member;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity // jpa에서 테이블을 생성하는 클래스라는 뜻
public class Member {

    @Id // 테이블의 id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // mysql에 해당되는 autoIncrement로 만들겠다
    private Long id;

    private String username;
    private String email;
}
