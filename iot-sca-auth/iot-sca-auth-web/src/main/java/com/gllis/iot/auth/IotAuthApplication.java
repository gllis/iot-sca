package com.gllis.iot.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * iot 鉴权服务
 *
 * @author glli
 * @date 2023/9/1
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.gllis.iot.auth.mapper")
public class IotAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(IotAuthApplication.class, args);
    }
}
