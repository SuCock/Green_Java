package com.mh.restapi05.todo;

import com.mh.restapi05.member.Member;
import jakarta.persistence.*;

@Entity
@Table(name="todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id", nullable = false)
    private Long id;

    private String todo;

    @ManyToOne // joinColumn 을 안해도 memberId를 가져올 수 있다
    private Member member;
}
