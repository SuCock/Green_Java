package com.mh.mychart.kakao;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

public class KakaoTokenRequestDto {

    @ToString
    @Builder
    @Getter
    public static class Request{
        private String grant_type;
        private String client_id;
        private String redirect_uri;
        private String client_secret;
        private String code;

    }

    @ToString
    @Builder
    @Getter
    public static class Response{
        private String access_token;
        private String token_type;
        private String refresh_token;
        private String expires_in;
        private String scope;

    }
}
