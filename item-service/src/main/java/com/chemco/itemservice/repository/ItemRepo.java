package com.chemco.itemservice.repository;

import com.chemco.itemservice.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {
    Item findByItemId(Long itemId);
}
