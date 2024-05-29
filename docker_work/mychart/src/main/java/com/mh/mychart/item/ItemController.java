package com.mh.mychart.item;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/item")
public class ItemController {

    @PostMapping("/new")
    public ResponseEntity<ItemDto> newIten(){
        System.out.println("new item");
        return ResponseEntity.status(HttpStatus.OK).body(new ItemDto("아메리카노", 2000));
    }
}
