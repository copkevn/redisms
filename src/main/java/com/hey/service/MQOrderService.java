package com.hey.service;

import com.hey.config.MyRabbitMQConfig;
import com.hey.po.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: MQOrderService
 * @Author: HeYong
 * @Date: 2020-09-27/0027 17:40
 * @Description: Description
 * @Version: 1.0
 */
@Service
@Slf4j
public class MQOrderService {
    @Resource
    private OrderService orderService;
    /**
     * 监听订单消息队列，并消费
     *
     * @param order
     */
    @RabbitListener(queues = MyRabbitMQConfig.ORDER_QUEUE)
    public void createOrder(Order order) {
        log.info("收到订单消息，订单用户为：{}，商品名称为：{}", order.getOrder_user(), order.getOrder_name());
        /**
         * 调用数据库orderService创建订单信息
         */
        orderService.createOrder(order);
    }
}

