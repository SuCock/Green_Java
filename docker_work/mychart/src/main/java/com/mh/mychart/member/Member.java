package com.mh.mychart.member;

import jakarta.persistence.Entity;
import lombok.Builder;

@Builder
public class Member {
    private String email;
    private String nickname;
    private String profileImageUrl;
    private String thumbnailImageUrl;
}
