package com.mh.mychart.kakao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "https://kapi.kakao.com", name = "kakaoInfo")
public interface KakaoInfoClient {

    @PostMapping(value = "/v2/user/me", consumes = "application/json")
    KakaoProfileDto getKakaoInfo(
            @RequestHeader ("Authorization") String accessToken);
}
