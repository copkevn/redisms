package com.hey.mapper;

import com.hey.base.GenericMapper;
import com.hey.po.Stock;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: StockMapper
 * @Author: HeYong
 * @Date: 2020-09-27/0027 17:29
 * @Description: Description
 * @Version: 1.0
 */
@Mapper
public interface StockMapper extends GenericMapper<Stock> {
}

