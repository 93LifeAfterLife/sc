package com.sc.sc01.service;

import com.sc.sc01.pojo.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItems(String orderId);
    void decreaseNumbers(List<Item> list);
}
