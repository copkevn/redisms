package com.hey;

import com.hey.service.RedisService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
@MapperScan("com.hey.mapper")
public class RedismsApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(RedismsApplication.class, args);
    }
    @Resource
    private RedisService redisService;

    /**
     * redis初始化商品的库存量和信息
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        redisService.put("watch", 10, 20);
    }
}
