package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Box", "Robot", "Apple");
        list = new ArrayList<>(list);
        List<String> copyList = Arrays.asList(new String[list.size()]);

        Collections.copy(copyList, list);
        System.out.println("==============copy===============");
        System.out.println(copyList);
        System.out.println("=================================");

        // 컬렉션 프레임워크를 안쓸때는 반복문으로 찾는다(자바 8버전)
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) .equals("Box")){
                System.out.println(list.get(i));
            }
        }
        
        // 조건문 대신해서 문자열의 길이가 5가되면 tlist에 담아라
        List<String> tlist = list.stream().filter(
                s -> s.length() == 5
                ).toList();
        System.out.println(tlist);
        // 문자열의 길이를 olist에 담아라
        List<Integer> olist = list.stream().map(
                s -> s.length()
        ).toList();

        copyList.set(0,"aaa");
        System.out.println(copyList);

        Collections.sort(list);
        System.out.println(list);

        int idx = Collections.binarySearch(list, "Robot");
        System.out.println(idx);

        System.out.println(list.get(idx));
    }
}
