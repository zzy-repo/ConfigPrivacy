package com.zzy.contoller;

import com.zzy.entity.User;
import com.zzy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/test")
    public List<User> test() {
        return userMapper.selectList(null);
    }
}
