package org.example;

import java.util.Arrays;
import java.util.List;

public class Main7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BOX", "ROBOT", "COMPLEX", "SIMPLE");

        String result = list.stream()
                // indentity도 같이 비교한다
                .reduce("", (s, s2) -> {
                    if(s.length() > s2.length()){
                        return s;
                    }else{
                        return s2;
                    }
                });

        System.out.println(result);

        System.out.println();

        result = list.stream()
                // indentity도 같이 비교한다
                .reduce("AAAAAAAAA", (s, s2) -> {
                    if(s.length() > s2.length()){
                        return s;
                    }else{
                        return s2;
                    }
                });

        System.out.println(result);
    }
}
