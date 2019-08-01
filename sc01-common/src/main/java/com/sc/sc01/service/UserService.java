package com.sc.sc01.service;

import com.sc.sc01.pojo.User;

public interface UserService {
    User getUser(Integer id);
    void addScore(Integer id, Integer score);
}
