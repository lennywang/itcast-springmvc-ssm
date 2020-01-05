package com.itcast.ssm.service;

import com.itcast.ssm.bean.Item;

import java.util.List;

/**
 *
 **/
public interface ItemService {
    public List<Item> getItemList();

    public Item getItemById(Integer id);

    public Integer updateItem(Item item);
}
