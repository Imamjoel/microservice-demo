package com.chemco.itemservice.controller;

import com.chemco.itemservice.entity.Item;
import com.chemco.itemservice.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@Slf4j
public class ItemController {

    @Autowired
    private ItemService itemService;


    @PostMapping("/save")
    public Item saveItem(@RequestBody Item item) {
        return itemService.save(item);
    }

    @GetMapping("/{id}")
    public Item findById(@PathVariable("id") Long itemId) {
        return itemService.findByItemId(itemId);
    }
}
