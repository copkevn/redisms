package com.hey.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName: StockService
 * @Author: HeYong
 * @Date: 2020-09-27/0027 17:38
 * @Description: Description
 * @Version: 1.0
 */

public interface StockService {
    void decrByStock(String stockName);

    Integer selectByExample(String stockName);
}

