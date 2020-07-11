package com.shh.homework.service.Impl;

import com.shh.homework.entity.Orders;
import com.shh.homework.mapper.OrdersMapper;
import com.shh.homework.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Resource
    OrdersMapper ordersMapper;
    @Override
    public List<Orders> showOrders(int id) {
        List<Orders> orders = ordersMapper.selectById(id);
        return orders;
    }
}
