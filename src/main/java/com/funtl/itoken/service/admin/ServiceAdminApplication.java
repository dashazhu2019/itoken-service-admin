package com.funtl.itoken.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.test.context.ActiveProfiles;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author shkstart
 * @date 2020/8/11  -  8:15
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.funtl.itoken.service.admin.mapper")
@ActiveProfiles(value="prod")
public class ServiceAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class,args);
    }
}
