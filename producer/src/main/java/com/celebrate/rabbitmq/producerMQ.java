package com.celebrate.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者：zhouqinghe
 * 日期时间：2021/1/30 9:33 下午
 * 功能描述：
 */
@Component
@RestController
@ResponseBody

public class producerMQ {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/msg")

    public String send(){
        for (int i = 0; i < 100; i++) {
            rabbitTemplate.convertAndSend("funout_celebrate","","你哈你好+"+i);
        }
        return  "订阅模式发送成功";
    }


}
