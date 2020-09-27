package com.hey.service.impl;

import com.hey.mapper.StockMapper;
import com.hey.po.Stock;
import com.hey.service.StockService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: StockServiceImpl
 * @Author: HeYong
 * @Date: 2020-09-27/0027 17:37
 * @Description: Description
 * @Version: 1.0
 */
@Service
public class StockServiceImpl implements StockService {

    @Resource
    private StockMapper stockMapper;
    // 秒杀商品后减少库存
    @Override
    public void decrByStock(String stockName) {
        Example example = new Example(Stock.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name", stockName);
        List<Stock> stocks = stockMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(stocks)) {
            Stock stock = stocks.get(0);
            stock.setStock(stock.getStock() - 1);
            stockMapper.updateByPrimaryKey(stock);
        }
    }
    // 秒杀商品前判断是否有库存
    @Override
    public Integer selectByExample(String stockName) {
        Example example = new Example(Stock.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name", stockName);
        List<Stock> stocks = stockMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(stocks)) {
            return stocks.get(0).getStock().intValue();
        }
        return 0;
    }
}

