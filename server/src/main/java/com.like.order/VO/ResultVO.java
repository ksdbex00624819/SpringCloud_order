package com.like.order.VO;

import lombok.Data;

/**
 * Created by like
 * 2018/5/27
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String message;

    private T data;
}
