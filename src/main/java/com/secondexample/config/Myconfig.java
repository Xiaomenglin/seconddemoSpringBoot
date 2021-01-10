package com.secondexample.config;

import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.methods.LogicDeleteByIdWithFill;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan("com.secondexample.mapper")
public class Myconfig {
    /**
     * 乐观锁插件
     * **/
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }

    /**
     * 逻辑删除
     */
    @Bean
    public ISqlInjector logicSqlInjector() {
        return new DefaultSqlInjector();
    }
}
