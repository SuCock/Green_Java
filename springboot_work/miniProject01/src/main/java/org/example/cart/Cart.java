package org.example.cart;

import lombok.Data;

@Data
// 카트 테이블의 내한 내용
public class Cart {
    private long cart_id;
    private String reg_time;
    private String update_time;
    private String created_by;
    private String modified_by;
    private String member_id;
}
