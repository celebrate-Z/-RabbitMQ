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
//@RabbitListener(queues = "scelebrate")
public class producerMQ {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/msg")
//    @RabbitHandler
    public void send(){
        rabbitTemplate.convertAndSend("scelebrate","你哈你好");
    }


}
