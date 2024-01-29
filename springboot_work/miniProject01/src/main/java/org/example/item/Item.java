package org.example.item;

import lombok.*;

@Data
@Builder
public class Item {
    private long item_id; // 자동증가(자동)
	private String reg_time; // 현재시간(자동)
	private String update_time; // 수정시간(자동)
	private String created_by; // 로그인했는 사람(자동)
    private String modified_by; // 로그인했는 사람(자동)

    private String item_detail;
    private String item_nm;
    private String item_sell_status;
    private int price;
	private int stock_number;
}
