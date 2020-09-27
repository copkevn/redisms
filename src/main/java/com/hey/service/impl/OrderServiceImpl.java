package com.hey.service.impl;

import com.hey.mapper.OrderMapper;
import com.hey.po.Order;
import com.hey.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: OrderServiceImpl
 * @Author: HeYong
 * @Date: 2020-09-27/0027 17:34
 * @Description: Description
 * @Version: 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public void createOrder(Order order) {
        orderMapper.insert(order);
    }
}

