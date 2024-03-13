package com.mh.restapi03.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// header는 주소경로에 값이 추가되지 않는다
@RestController
@RequestMapping("/api")
public class HeaderController {
    @GetMapping(value = "header", headers = "v1=1")
        public String paramV1(){
        return "headersV1";
    }

    @GetMapping(value = "header", headers = "v1=2")
    public String paramV2(){
        return "headersV2";
    }
}
