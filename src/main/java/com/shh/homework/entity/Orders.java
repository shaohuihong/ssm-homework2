package com.shh.homework.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Data
public class Orders implements Serializable {
    private BigInteger id;
    private BigInteger memberId;
    private String orderNo;
    private Date createTime;
    private BigDecimal totalAmount;
    private OrdersItem ordersItem;
}
