package com.sc.sc09.service;

import com.sc.sc01.pojo.User;
import com.sc.sc09.service.fallback.UserFeignServiceFB;
import com.sc.web.utils.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="user-service", fallback = UserFeignServiceFB.class)
public interface UserFeignService {
    @GetMapping("/{userId}")
    JsonResult<User> getUser(@PathVariable Integer userId);

    // 拼接路径 /{userId}/score?score=新增积分
    // 如果请求参数和方法参数同名,@RequestParam可省略
    @GetMapping("/{userId}/score")
    JsonResult addScore(@PathVariable Integer userId, @RequestParam Integer score);
}
