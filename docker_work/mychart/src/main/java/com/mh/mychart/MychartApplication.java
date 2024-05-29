package com.mh.mychart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableFeignClients // FeignClient를 사용하기 위한 활성화
@EnableJpaAuditing // entity 객체 생성시 createDate, modifyDate 자동 생성
public class MychartApplication {

	public static void main(String[] args) {
		SpringApplication.run(MychartApplication.class, args);
	}

}
