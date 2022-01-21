package org.xujin.halo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.xujin.halo.annotation.HaloApplication;
import org.xujin.halo.annotation.domain.Domain;

/**
 * @author halo codegen
 */
@Domain(code = "basic", parentCode = "bp", name = "基础域", desc = "基础服务域")
@EnableEurekaClient
@EnableFeignClients
@HaloApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
