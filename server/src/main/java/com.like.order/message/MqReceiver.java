package com.like.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 接收mq消息
 * <p>
 * Created by like
 * 2018/6/17
 */
@Slf4j
@Component
public class MqReceiver {

    // 1.手动创建队列 @RabbitListener(queues = "myQueue")
    // 2.自动创建队列 @RabbitListener(queuesToDeclare = @Queue("myQueue"))
    // 3.自动创建，Exchange和Queue绑定
    @RabbitListener(bindings = @QueueBinding(value = @Queue("myQueue"), exchange = @Exchange("myExchange")))
    public void process(String message) {
        log.info("MqReceiver:{}", message);
    }

    /**
     * 数码供应商服务 接收消息
     *
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(value = @Queue("computerOrder"), exchange = @Exchange("myOrder"), key = "computer"))
    public void processComputer(String message) {
        log.info("computer MqReceiver:{}", message);
    }

    /**
     * 水果供应商服务 接收消息
     *
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(value = @Queue("fruitOrder"), exchange = @Exchange("myOrder"), key = "fruit"))
    public void processFruit(String message) {
        log.info("fruit MqReceiver:{}", message);
    }
}
