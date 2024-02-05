package org.example;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;
import java.util.Set;

class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    // implements Comparable<Person> 일떄
    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    //implements Comparable 일때
    //    @Override
//    public int compareTo(Object o) {
//        return this.age - ((Person)o).age;
//    }
}
class Comp implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}
public class Main4 {
    public static void main(String[] args) {
        Set<Person> ts = new TreeSet<>(new Comp());
        ts.add(new Person("홍길동", 100));
        ts.add(new Person("김길동", 20));
        ts.add(new Person("이길동", 30));
        System.out.println(ts);
    }
}
