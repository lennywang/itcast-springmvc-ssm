package com.itcast.ssm.service;

import com.itcast.ssm.bean.Item;
import com.itcast.ssm.dao.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 **/
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    public List<Item> getItemList() {
        return itemMapper.getItemList();
    }

    public Item getItemById(Integer id) {
        return itemMapper.getItemById(id);
    }

    public Integer updateItem(Item item) {
        return itemMapper.updateItem(item);
    }

}
