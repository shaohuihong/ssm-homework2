package com.shh.homework.service;

import com.shh.homework.entity.Orders;

import java.math.BigInteger;
import java.util.List;

public interface OrdersService {

    List<Orders> showOrders(int id);
}
