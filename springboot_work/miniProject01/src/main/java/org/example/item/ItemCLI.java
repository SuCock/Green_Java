package org.example.item;

import java.util.Scanner;

public class ItemCLI {

    public Item inputItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("상품이름을 입력하세요 > ");
        String nm = sc.nextLine();
        System.out.println("상품설명을 입력하세요 > ");
        String detail = sc.nextLine();
        System.out.println("상품의 SELL or SOLD_OUT 입력하세요 > ");
        String sell_status = sc.nextLine();
        System.out.println("상품의 가격을 입력하세요 > ");
        int price = sc.nextInt();
        System.out.println("상품의 재고를 입력하세요 > ");
        int stock = sc.nextInt();

        return Item.builder()
                .item_nm(nm)
                .item_detail(detail)
                .item_sell_status(sell_status)
                .price(price)
                .stock_number(stock)
                .build();
    }
}
