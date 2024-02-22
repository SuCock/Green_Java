package org.example;

import org.example.component.AA;
import org.example.component.BB;
import org.example.conf.AppContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);

        BB bb = context.getBean(BB.class);
        System.out.println(bb.getHi());
        
        // AppContext안에 클래스를 가져온다
//        String[] beans = context.getBeanDefinitionNames();
//
//        Arrays.stream(beans).forEach(System.out::println);
//
//        AA a1 = context.getBean(AA.class);
//        System.out.println(a1);
//
//        AA a2 = context.getBean(AA.class);
//        System.out.println(a2);
//
//
//        a1.setName("감사합니다!! 굳굳!!");
//
//        System.out.println(a1.getName());
//        System.out.println(a2.getName());
//        System.out.println(a1 == a2);
        context.close();

    }
}