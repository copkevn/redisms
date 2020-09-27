package com.hey.service;

import com.hey.po.Order;
import org.springframework.stereotype.Service;

/**
 * @ClassName: OrderService
 * @Author: HeYong
 * @Date: 2020-09-27/0027 17:35
 * @Description: Description
 * @Version: 1.0
 */
@Service
public interface OrderService {

    void createOrder(Order order);
}

