package com.gzf.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//排除自动配置
public class PracticeProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeProjectApplication.class, args);
        System.out.println("=====成功=====");
    }

}
