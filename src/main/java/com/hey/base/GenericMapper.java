package com.hey.base;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
//关于这个接口得作用你需要了解太多，你只要知道我们得mapper层需要通过继承它来实现数据库操作，
// 如果你接触过jpa或者mybatis-plus，tkmybatis方式跟它们相似。
public interface GenericMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
