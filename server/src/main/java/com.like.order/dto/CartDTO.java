package com.like.order.dto;

import lombok.Data;

/**
 * Created by like
 * 2018/6/6
 */
@Data
public class CartDTO {
    /**
     * 商品ID
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
