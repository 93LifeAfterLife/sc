package com.sc.sc03.user.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.sc.sc01.pojo.User;
import com.sc.sc01.service.UserService;
import com.sc.web.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Value("${sp.user-service.users}")
    private String userJson;

    @Override
    public User getUser(Integer id) {
        log.info("users json string : "+userJson);
        List<User> list = JsonUtil.from(userJson, new TypeReference<List<User>>() {});
        for (User u : list) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return new User(id, "name-"+id, "pwd-"+id);
    }

    @Override
    public void addScore(Integer id, Integer score) {
        //TODO 这里增加积分
        log.info("user "+id+" - 增加积分 "+score);
    }
}
