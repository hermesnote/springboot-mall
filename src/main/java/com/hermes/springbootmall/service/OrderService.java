package com.hermes.springbootmall.service;

import com.hermes.springbootmall.dto.CreateOrderRequest;
import com.hermes.springbootmall.dto.OrderQueryParams;
import com.hermes.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
