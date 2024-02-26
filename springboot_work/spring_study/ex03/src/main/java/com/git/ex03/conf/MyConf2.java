package com.git.ex03.conf;

import com.git.ex03.component.AA;
import org.springframework.context.annotation.Bean;

public class MyConf2 {
    //@Bean
    public AA aa(){
        return new AA();
    }
}
