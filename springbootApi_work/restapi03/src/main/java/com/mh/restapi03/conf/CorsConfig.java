package com.mh.restapi03.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 경로
                .allowedOrigins("*") // 모든 아이피
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 모든 메소드
                .allowedHeaders("*");
    }
}
