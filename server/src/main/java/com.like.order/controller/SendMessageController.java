package com.like.order.controller;

import com.like.order.dto.OrderDTO;
import com.like.order.message.MySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by like
 * 2018/7/7
 */
@RestController
@EnableBinding(MySource.class)
public class SendMessageController {

    @Autowired
    private MySource mySource;

//    @GetMapping("/sendMessage")
//    public void process() {
//        String message = "now " + new Date();
//        mySource.output().send(MessageBuilder.withPayload(message).build());
//    }

    /**
     * 发送OrderDTO对象
     */
    @GetMapping("/sendMessage")
    public void process() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("123456");
        mySource.output().send(MessageBuilder.withPayload(orderDTO).build());
    }
}
