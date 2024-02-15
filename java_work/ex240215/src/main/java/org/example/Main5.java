package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main5 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("BOX", "ROBOT", "SIMPLE");

        // 문자열의 길이를 구한다.
        Stream<Integer> is = list1.stream().map(s -> s.length());
        is.forEach(System.out::println);
        
        // 문자를 연속으로 출력
        list1.stream()
                .map(s -> s + s)
                .forEach(System.out::println);

        // 문자뒤에 붙이기
        list1.stream()
                .map(s -> {return  s + "입니다";})
                .forEach(System.out::println);
        
        // person에서 이름만 가져오기
        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("김길동", 30);
        Person p3 = new Person("이길동", 30);
        Person p4 = new Person("박길동", 34);

        List<Person> list = Arrays.asList(p1, p2, p3, p4);
        list.stream()
                .map(person -> "이름은 " + person.getName() + " 입니다")
                .forEach(System.out::println);
        
        for(Person person : list){
            System.out.println(person.getName() + " 입니다");
        }

        // 모든 사람의 나이를 구해라
        int ageSum = list.stream()
                        .map(person -> person.getAge())
                        .filter(integer -> integer > 20)
                        .reduce(0, ((integer, integer2) -> integer += integer2));
        System.out.println("사람들의 총 나이 = " + ageSum);

        // 21살 이상의 사람의 나이를 구해라
        int ageSum20 = list.stream()
                // person의 나이만 맵핑한다.
                .map(person -> person.getAge())
                .filter(integer -> integer > 20)
                .reduce(0, ((integer, integer2) -> integer += integer2));
        System.out.println("21살 이상의 사람들의 총 나이 = " + ageSum20);
    }
}
