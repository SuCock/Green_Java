package org.example.components;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MemberService implements InitializingBean, DisposableBean {
    @Autowired
    private MemberRepository memberRepository;

    private String str;

    public void regist() {
        memberRepository.insert();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        str = "jdbc:mysql://192.168."; // 디비연결
        System.out.println("IOC컨테이너에 들어갈때");
    }

    @Override
    public void destroy() throws Exception {
        // 객체가 없어질때 리소스 반환
        System.out.println("IOC컨테이너 없어질떄");
    }


}
