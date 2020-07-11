package com.shh.homework.entity;

import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
@Data
public class OrdersItem implements Serializable {
    private BigInteger id;
    private BigInteger ordersId;
    private String ordersNo;
    private BigInteger productId;
    private String productPic;
    private String productName;
    private BigDecimal productPrice;
    private Integer productQuantity;
}
