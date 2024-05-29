package com.ksm.firstservice.first;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("first")
@RequiredArgsConstructor
public class FirstController {

    private final Environment env;

    @GetMapping("/info")
    public String info(){
        return "info" + env.getProperty("server.port");
    }

}
