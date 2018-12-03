package com.zzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "om.zzc.tk.mapper.*")
public class SpringbootManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootManageApplication.class, args);
    }
}
