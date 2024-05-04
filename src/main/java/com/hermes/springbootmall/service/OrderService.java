package com.hermes.springbootmall.service;

import com.hermes.springbootmall.dto.CreateOrderRequest;
import com.hermes.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
