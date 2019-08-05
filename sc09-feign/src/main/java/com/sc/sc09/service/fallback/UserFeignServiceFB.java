package com.sc.sc09.service.fallback;

import com.sc.sc01.pojo.User;
import com.sc.sc09.service.UserFeignService;
import com.sc.web.utils.JsonResult;
import org.springframework.stereotype.Component;

@Component
public class UserFeignServiceFB implements UserFeignService {
    @Override
    public JsonResult<User> getUser(Integer userId) {
        return JsonResult.err("无法获取用户信息");
    }

    @Override
    public JsonResult addScore(Integer userId, Integer score) {
        return JsonResult.err("无法增加用户积分");
    }

}
