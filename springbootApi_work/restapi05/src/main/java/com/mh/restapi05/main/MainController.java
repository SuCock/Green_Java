package com.mh.restapi05.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {
    // RestController -> UserEntity JSON{"key" : "value", "key" : "value"}
    // Controller -> layout/common경로로 이동
    @GetMapping("/main")
    public String main(Model model){
        model.addAttribute("name", "홍길동");
        return "main";
    }
}
