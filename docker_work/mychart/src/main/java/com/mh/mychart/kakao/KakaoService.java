package com.mh.mychart.kakao;

import lombok.RequiredArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KakaoService {

    private final KakaoTokenClient kakaoTokenClient;
    private final KakaoInfoClient kakaoInfoClient;
    private String contentType = "Content-Type: application/x-www-form-urlencoded";

    @Value("${kakao.client.id}")
    private String clientId;
    @Value("${kakao.client.secret}")
    private String clientSecret;
    @Value("${kakao.client.redirect}")
    private String redirectUri;

    public String getKakaoToken(String code){
        KakaoTokenRequestDto.Request kakaoTokenDtoRequest =
        KakaoTokenRequestDto.Request.builder()
                .grant_type("authorization_code")
                .redirect_uri(redirectUri)
                .client_id(clientId)
                .code(code)
                .client_secret(clientSecret)
                .build();
        KakaoTokenRequestDto.Response response = kakaoTokenClient.getKakaoToken(contentType,kakaoTokenDtoRequest);
        System.err.println("accessToken = " + response.getAccess_token());

        KakaoProfileDto kakaoInfo = kakaoInfoClient.getKakaoInfo("Bearer " + response.getAccess_token());
        System.err.println(kakaoInfo);



        return "getKakaoToken";
    } ;
}
