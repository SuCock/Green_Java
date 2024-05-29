package com.ksm.userservice.user;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private long user_idx;
    @NotBlank
    @Schema(example = "qwre@naver.com")
    private String user_email;

    @Schema(example = "홍길동")
    private String user_name;
    
    // 이러면 첨부터 베재하고 들어간다(디비자원을 안쓴다)
    // jsonignore는 결과만 안보이는 것
    @Schema(hidden = true)
    private String user_password;
}
