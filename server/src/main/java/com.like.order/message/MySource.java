package com.like.order.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

/**
 * 输出通道
 *
 * Created by like
 * 2018/7/7
 */
public interface MySource {

    @Output(Source.OUTPUT)
    MessageChannel output();
}
