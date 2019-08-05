package com.sc.sc09.service;

import com.sc.sc01.pojo.Order;
import com.sc.sc09.service.fallback.OrderFeignServiceFB;
import com.sc.web.utils.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="order-service",fallback = OrderFeignServiceFB.class)
public interface OrderFeignService {
    @GetMapping("/{orderId}")
    JsonResult<Order> getOrder(@PathVariable String orderId);

    @GetMapping("/")
    JsonResult addOrder();
}
