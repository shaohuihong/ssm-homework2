package com.shh.homework.controller;

import com.shh.homework.entity.Orders;
import com.shh.homework.service.OrdersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SelectByIdController {
    @Resource
    OrdersService ordersService;
    @GetMapping("/select")
    public List<Orders> select(int id) {
        List<Orders> orders = ordersService.showOrders(id);
        return orders;
    }
}
