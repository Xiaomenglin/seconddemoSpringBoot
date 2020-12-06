package com.secondexample.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
}
