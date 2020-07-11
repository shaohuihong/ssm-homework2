package com.shh.homework.mapper;

import com.shh.homework.entity.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersMapper {
    // 根据id查询商品详细信息
    List<Orders> selectById(@Param("id") int id);

}
