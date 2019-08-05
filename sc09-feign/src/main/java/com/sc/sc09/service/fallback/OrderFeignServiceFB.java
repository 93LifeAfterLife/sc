package com.sc.sc09.service.fallback;

import com.sc.sc01.pojo.Order;
import com.sc.sc09.service.OrderFeignService;
import com.sc.web.utils.JsonResult;
import org.springframework.stereotype.Component;

@Component
public class OrderFeignServiceFB implements OrderFeignService {
    @Override
    public JsonResult<Order> getOrder(String orderId) {
        return JsonResult.err("无法获取商品订单");
    }

    @Override
    public JsonResult addOrder() {
        return JsonResult.err("无法保存订单");
    }
}
