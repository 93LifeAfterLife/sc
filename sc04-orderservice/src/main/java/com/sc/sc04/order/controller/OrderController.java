package com.sc.sc04.order.controller;

import com.sc.sc01.pojo.Item;
import com.sc.sc01.pojo.Order;
import com.sc.sc01.pojo.User;
import com.sc.sc01.service.OrderService;
import com.sc.web.utils.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/{orderId}")
    public JsonResult<Order> getOrder(@PathVariable String orderId) {
        log.info("get order, id="+orderId);

        Order order = orderService.getOrder(orderId);
        return JsonResult.ok(order);
    }

    @GetMapping("/")
    public JsonResult addOrder() {
        //模拟post提交的数据
        Order order = new Order();
        order.setId("123abc");
        order.setUser(new User(7,null,null));
        order.setItems(Arrays.asList(new Item[] {
                new Item(1,"aaa",2),
                new Item(2,"bbb",1),
                new Item(3,"ccc",3),
                new Item(4,"ddd",1),
                new Item(5,"eee",5),
        }));
        orderService.addOrder(order);
        return JsonResult.ok();
    }
}
