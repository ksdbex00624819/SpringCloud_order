package com.like.order.service;

import com.like.order.dto.OrderDTO;

/**
 * Created by like
 * 2018/5/27
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
