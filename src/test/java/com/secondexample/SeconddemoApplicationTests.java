package com.secondexample;

import com.secondexample.entity.User;
import com.secondexample.mapper.UserMapper;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import java.util.List;


@SpringBootTest
class SeconddemoApplicationTests extends AbstractTestNGSpringContextTests {
    Logger logger = LoggerFactory.getLogger(SeconddemoApplicationTests.class);
    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<User> userList= userMapper.selectList(null);
        System.out.println(userList);
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setName("东方不败");
        user.setAge(60);
        user.setEmail("dfbb@test.com");
        int insertUser = userMapper.insert(user);
        logger.info("======="+insertUser);
    }

    @Test
    public void updateUser(){
        User user = new User();
        user.setId(1335564248683667458L);
        user.setAge(120);

        int row = userMapper.updateById(user);
        Assert.assertTrue("更新失败",row==1);
    }

}
