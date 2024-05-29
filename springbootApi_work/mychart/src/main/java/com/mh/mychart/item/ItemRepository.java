package com.mh.mychart.item;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long>, ItemRepositoryCustom {

    Optional<Item> findByItemNm(String itemNm);

    List<Item> findByPriceLessThan(int price);

    List<Item> findByPriceLessThanOrderByPriceDesc(int price);

    @Query("select i from Item i where i.price < :price order by i.price desc")
    Item myCustom(int price);
}