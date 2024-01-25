package org.example.mh;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
@Builder
public class Member{
    private String email;
    private String name;
    private String addr;
    private String password;
    private String role;
}
