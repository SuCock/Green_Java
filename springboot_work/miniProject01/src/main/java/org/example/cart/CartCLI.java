package org.example.cart;

import org.example.Main;
import java.util.Scanner;

public class CartCLI {
    public int inputItem(){
        Main.id.select();
        Scanner sc = new Scanner(System.in);
        System.out.println("넣고 싶은 상품 번호를 입력하세요");
        int idx = sc.nextInt();
        return idx;
    }
}
