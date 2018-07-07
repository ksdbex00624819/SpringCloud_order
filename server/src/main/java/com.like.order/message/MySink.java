package com.like.order.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.SubscribableChannel;

/**
 * 输入通道
 * <p>
 * Created by like
 * 2018/7/7
 */
public interface MySink {

    String INPUT2 = "input2";

    @Input(Sink.INPUT)
    SubscribableChannel input();

    @Input(MySink.INPUT2)
    SubscribableChannel input2();

}
