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

import java.util.Arrays;
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

    /**测试乐观锁**/
    @Test
    public void testoptimisticLockerInnerInterceptor(){
        //根据ID查询
        User user = userMapper.selectById(1348117076736282626L);

        //进行修改
        user.setAge(200);
        userMapper.updateById(user);
    }

    /**逻辑删除**/
    @Test
    public void testDeleteById(){
        int result = userMapper.deleteById(1348158345843929090L);
        logger.info("逻辑删除"+result);
    }

    /**批量删除**/
    @Test
    public void testDeleteBatchId(){
        int result = userMapper.deleteBatchIds(Arrays.asList(1348108359668477953L,1348107676743114753L));
        logger.info("批量删除"+result);
    }

}
