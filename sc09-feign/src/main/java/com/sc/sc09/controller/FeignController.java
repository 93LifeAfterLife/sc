package com.sc.sc09.controller;

import com.sc.sc01.pojo.Item;
import com.sc.sc01.pojo.Order;
import com.sc.sc01.pojo.User;
import com.sc.sc09.service.ItemFeignService;
import com.sc.sc09.service.OrderFeignService;
import com.sc.sc09.service.UserFeignService;
import com.sc.web.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeignController {
    @Autowired
    private ItemFeignService itemServcie;
    @Autowired
    private UserFeignService userServcie;
    @Autowired
    private OrderFeignService orderServcie;

    @GetMapping("/item-service/{orderId}")
    public JsonResult<List<Item>> getItems(@PathVariable String orderId) {
        return itemServcie.getItems(orderId);
    }

    @PostMapping("/item-service/decreaseNumber")
    public JsonResult decreaseNumber(@RequestBody List<Item> items) {
        return itemServcie.decreaseNumber(items);
    }

    /////////////////////////////////////////

    @GetMapping("/user-service/{userId}")
    public JsonResult<User> getUser(@PathVariable Integer userId) {
        return userServcie.getUser(userId);
    }

    @GetMapping("/user-service/{userId}/score")
    public JsonResult addScore(@PathVariable Integer userId, Integer score) {
        return userServcie.addScore(userId, score);
    }

    /////////////////////////////////////////

    @GetMapping("/order-service/{orderId}")
    public JsonResult<Order> getOrder(@PathVariable String orderId) {
        return orderServcie.getOrder(orderId);
    }

    @GetMapping("/order-service")
    public JsonResult addOrder() {
        return orderServcie.addOrder();
    }
}
