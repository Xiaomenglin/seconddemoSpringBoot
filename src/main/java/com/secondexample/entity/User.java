package com.secondexample.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    //createTime
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    //updateTime
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @Version  /**乐观锁**/
    @TableField(fill = FieldFill.INSERT)
    private int version;//版本号
}
