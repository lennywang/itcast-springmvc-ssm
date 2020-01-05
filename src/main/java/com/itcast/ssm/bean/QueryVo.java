package com.itcast.ssm.bean;

import java.util.List;

/**
 *
 **/
public class QueryVo {
    public Item item;

    public Integer[] ids;

    public List<Item> itemList;

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
