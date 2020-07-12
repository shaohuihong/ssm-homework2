package com.shh.homework.mapper;

import com.shh.homework.entity.Orders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-mybatis.xml"})
public class OrdersMapperTest {
    @Resource
    OrdersMapper ordersMapper;
    @Test
    public void selectById() {
        List<Orders> orders = ordersMapper.selectById(1);
        System.out.println(orders);
    }
}