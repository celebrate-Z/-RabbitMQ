package com.celebrate.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 作者：zhouqinghe
 * 日期时间：2021/2/1 10:13 上午
 * 功能描述：
 */
@Component
@RabbitListener(queues="funout_queues2")
public class FunoutConsumer2 {

    @RabbitHandler
    public void process(String message) {
        System.out.println("广播监听模式，接收器2222222"+message);
    }
}
