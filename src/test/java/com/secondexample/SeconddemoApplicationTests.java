package com.secondexample;

import com.secondexample.entity.User;
import com.secondexample.mapper.UserMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import java.util.List;


@SpringBootTest
class SeconddemoApplicationTests extends AbstractTestNGSpringContextTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<User> userList= userMapper.selectList(null);
        System.out.println(userList);
    }

    @Test
    public void insert(){
        User user = new User();
        user.setName("李四");
        user.setAge(23);
        user.setEmail("lisi@test.com");
        int insertUser = userMapper.insert(user);
    }

}
