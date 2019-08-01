package com.sc.sc01.service;

import com.sc.sc01.pojo.Order;

public interface OrderService {
    Order getOrder(String orderId);
    void addOrder(Order order);
}
