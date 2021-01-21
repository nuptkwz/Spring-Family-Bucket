package com.example.springboot.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Description Profile for class
 * 需要在dev环境下执行的数据初始化
 * Date 2021/1/21 23:21
 * Created by kwz
 */
@Profile("dev")
@Configuration
@Slf4j
public class DevDataInitConfig {

    @Bean
    public CommandLineRunner dataInit() {
        //实现了该接口的代码会在 Spring Boot 应用程序启动时自动进行执行
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                log.info("init dev environment params");
            }
        };
    }
}
