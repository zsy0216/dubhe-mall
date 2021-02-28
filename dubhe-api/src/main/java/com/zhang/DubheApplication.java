package com.zhang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: zhangshuaiyin
 * @date: 2021/2/28 13:01
 */
@MapperScan("com.zhang.**.mapper")
@SpringBootApplication(scanBasePackages = "com.zhang.**")
public class DubheApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubheApplication.class, args);
    }
}
