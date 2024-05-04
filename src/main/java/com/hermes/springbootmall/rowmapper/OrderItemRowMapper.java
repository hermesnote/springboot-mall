package com.hermes.springbootmall.rowmapper;

import com.hermes.springbootmall.model.OrderItem;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderItemRowMapper implements RowMapper<OrderItem> {

    @Override
    public OrderItem mapRow(ResultSet results, int i) throws SQLException {
        OrderItem orderItem = new OrderItem();
        orderItem.setOrderItemId(results.getInt("order_item_id"));
        orderItem.setOrderId(results.getInt("order_id"));
        orderItem.setProductId(results.getInt("product_id"));
        orderItem.setQuantity(results.getInt("quantity"));
        orderItem.setAmount(results.getInt("amount"));

        orderItem.setProductName(results.getString("product_name"));
        orderItem.setImageUrl(results.getString("image_url"));

        return orderItem;
    }
}
