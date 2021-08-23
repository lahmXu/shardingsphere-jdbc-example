package com.lahmxu.example.service.biz;

import com.lahmxu.example.pojo.entity.User;

import java.util.List;

public interface IUserService {

    List<User> list();

    void save(User user);
}
