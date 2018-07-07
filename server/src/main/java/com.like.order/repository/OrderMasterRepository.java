package com.like.order.repository;

import com.like.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by like
 * 2018/5/27
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
