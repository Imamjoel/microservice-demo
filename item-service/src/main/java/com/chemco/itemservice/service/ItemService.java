package com.chemco.itemservice.service;

import com.chemco.itemservice.entity.Item;
import com.chemco.itemservice.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepo itemRepo;

    public Item save(Item item) {
        return itemRepo.save(item);
    }

    public Item findByItemId(Long itemId) {
        return itemRepo.findByItemId(itemId);
    }
}
