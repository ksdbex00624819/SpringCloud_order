package com.like.order.repository;

import com.like.order.OrderApplicationTests;
import com.like.order.dataobject.OrderMaster;
import com.like.order.enums.OrderStatusEnum;
import com.like.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by like
 * 2018/5/27
 */
@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("like");
        orderMaster.setBuyerPhone("187");
        orderMaster.setBuyerAddress("xx省xx市");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(BigDecimal.TEN);
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertTrue(result != null);
    }
}