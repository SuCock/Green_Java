package org.example;

import java.util.Arrays;
import java.util.List;

class Toy{
    public String name;
    private int price;

    public Toy(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
public class Main6 {
    public static void main(String[] args) {
        List<Toy> list = Arrays.asList(new Toy("로봇", 3000),
                                        new Toy("총", 5000),
                                        new Toy("인형", 10000));
        
        // sum을 사용
        int toySum = list.stream()
                .filter(toy -> toy.getPrice() < 10000)
                .mapToInt(value -> value.getPrice())
                .sum();
        System.out.println(toySum);
        
        // reduce를 사용
        toySum = list.stream()
                .filter(toy -> toy.getPrice() < 10000)
                .mapToInt(value -> value.getPrice())
                .reduce(0, (left, right) -> left += right);
        System.out.println(toySum);

    }
}
