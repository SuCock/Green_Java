package com.mh.restapi05.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {
    // RestController -> UserEntity JSON{"key" : "value", "key" : "value"}
    // Controller -> layout/common경로로 이동
    @RequestMapping(value = "/main", method = {RequestMethod.GET, RequestMethod.POST})
    public String main(Model model){
        model.addAttribute("name", "홍길동");
        return "main";
    }
}
