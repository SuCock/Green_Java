package com.mh.mychart.kakao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "https://kauth.kakao.com/oauth/token", name = "kakao")
public interface KakaoTokenClient {

    @PostMapping(consumes = "application/json")
    KakaoTokenRequestDto.Response getKakaoToken(
            @RequestHeader ("Content-type") String contentType,
            @SpringQueryMap KakaoTokenRequestDto.Request kakaTokenRequestDto);
}
