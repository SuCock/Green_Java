package com.mh.mychart.item;


import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class ItemRepositoryImpl implements ItemRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public List<ItemResDto> getItemList(){
        QItem qItem = QItem.item;
        List<Item> itemList = jpaQueryFactory.selectFrom(qItem).fetch();
        System.out.println(itemList);
        return null;
    }



}
