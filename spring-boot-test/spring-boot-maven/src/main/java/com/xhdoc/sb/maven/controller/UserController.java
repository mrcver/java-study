package com.xhdoc.sb.maven.controller;

import com.xhdoc.sb.maven.entity.UserEntity;
import com.xhdoc.sb.maven.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public String index() {
        List<UserEntity> users = userMapper.getAll();
        String userStr = "";
        for (UserEntity user : users) {
            userStr = userStr + String.valueOf(user);
        }
        return userStr;
    }

    @PutMapping("/user")
    public void insert(@Param("name") String name) {
        UserEntity user = new UserEntity(name);
        userMapper.insert(user);
    }
}
