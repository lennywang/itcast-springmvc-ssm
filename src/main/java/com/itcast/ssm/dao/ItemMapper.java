package com.itcast.ssm.dao;

import com.itcast.ssm.bean.Item;

import java.util.List;

/**
 *
 **/
public interface ItemMapper {
    List<Item> getItemList();

    Item getItemById(Integer id);

    Integer updateItem(Item item);
}
