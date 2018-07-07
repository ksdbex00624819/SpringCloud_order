package com.like.order.enums;

import lombok.Getter;

/**
 * Created by like
 * 2018/5/27
 */
@Getter
public enum ResultEnum {
    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
