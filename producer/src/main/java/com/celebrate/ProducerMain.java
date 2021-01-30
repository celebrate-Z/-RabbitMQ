package com.celebrate;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 作者：zhouqinghe
 * 日期时间：2021/1/30 9:32 下午
 * 功能描述：
 */
@SpringBootApplication
@EnableRabbit
public class ProducerMain {
    public static void main(String[] args) {
        SpringApplication.run(ProducerMain.class, args);
    }
}
