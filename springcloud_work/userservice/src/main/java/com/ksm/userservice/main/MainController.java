package com.ksm.userservice.main;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main")
@RequiredArgsConstructor
public class MainController {

    private final Environment env;

    @Value("${my.value")
    private String lombokMhValue;

    @GetMapping("/info")
    public String info(){
        String url = env.getProperty("server.port");
        String mhValue = env.getProperty("mh.value");
        return "port = "+url+"\n lombokValue = "+lombokMhValue+"\n 환경설정 = "+mhValue;
    }
}
