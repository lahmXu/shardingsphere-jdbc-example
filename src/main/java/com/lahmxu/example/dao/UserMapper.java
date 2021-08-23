package com.lahmxu.example.dao;

import com.lahmxu.example.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> list();

    void save(@Param("user") User user);
}
