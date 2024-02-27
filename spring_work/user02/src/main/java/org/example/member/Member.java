package org.example.member;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@Builder
@ToString
@Setter
public class Member {
    private Long id;
    private String email;
    private String password;
    private String name;
    private LocalDateTime wdate;

//    public Member(Long id, String email, String password, String name, LocalDateTime wdate) {
//        this.id = id;
//        this.email = email;
//        this.password = password;
//        this.name = name;
//        this.wdate = wdate;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public LocalDateTime getWdate() {
//        return wdate;
//    }
//
//    public void setWdate(LocalDateTime wdate) {
//        this.wdate = wdate;
//    }
//
//    @Override
//    public String toString() {
//        return "Member{" +
//                "id=" + id +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", name='" + name + '\'' +
//                ", wdate=" + wdate +
//                '}';
//    }


}
