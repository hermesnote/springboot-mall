package com.hermes.springbootmall.rowmapper;

import com.hermes.springbootmall.model.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderRowMapper implements RowMapper<Order> {

    @Override
    public Order mapRow(ResultSet results, int i) throws SQLException {
        Order order = new Order();
        order.setOrderId(results.getInt("order_id"));
        order.setUserId(results.getInt("user_id"));
        order.setTotalAmount(results.getInt("total_amount"));
        order.setCreatedDate(results.getTimestamp("created_date"));
        order.setLastModifiedDate(results.getTimestamp("last_modified_date"));

        return order;
    }
}
