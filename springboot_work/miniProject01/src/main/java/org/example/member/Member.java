package org.example.member;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
@Builder
public class Member{
    private String email;
    private String name;
    private String address;
    private String password;
    private String role;
    private long member_id;
}
