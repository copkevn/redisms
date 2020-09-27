package com.hey.mapper;

import com.hey.base.GenericMapper;
import com.hey.po.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: OrderMapper
 * @Author: HeYong
 * @Date: 2020-09-27/0027 17:29
 * @Description: Description
 * @Version: 1.0
 */
@Mapper
public interface OrderMapper extends GenericMapper<Order> {
    void insertOrder(Order order);
}

