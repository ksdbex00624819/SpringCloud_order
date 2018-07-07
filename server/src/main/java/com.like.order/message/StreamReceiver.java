package com.like.order.message;

import com.like.order.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * Created by like
 * 2018/7/7
 */
@Component
@EnableBinding(MySink.class)
@Slf4j
public class StreamReceiver {

//    @StreamListener(Sink.INPUT)
//    public void process(Object message) {
//        log.info("StreamReceiver: {}", message);
//    }

    /**
     * 接收OrderDTO对象
     * @param message
     */
    @StreamListener(Sink.INPUT)
    @SendTo(MySink.INPUT2)
    public String process(OrderDTO message) {
        log.info("StreamReceiver: {}", message);
        return "received.";
    }

    @StreamListener(MySink.INPUT2)
    public void process2(String message) {
        log.info("StreamReceiver2: {}", message);
    }
}
