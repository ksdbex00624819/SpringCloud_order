package com.like.order.repository;

import com.like.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by like
 * 2018/5/27
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
