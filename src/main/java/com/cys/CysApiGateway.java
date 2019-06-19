package com.cys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author cys
 * @date 2019/6/19
 * 配置网关启动器
 */
@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
public class CysApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(CysApiGateway.class, args);
    }
}
