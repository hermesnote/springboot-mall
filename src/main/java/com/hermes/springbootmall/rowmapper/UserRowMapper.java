package com.hermes.springbootmall.rowmapper;

import com.hermes.springbootmall.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet results, int i) throws SQLException {

        User user = new User();
        user.setUserId(results.getInt("user_id"));
        user.setEmail(results.getString("email"));
        user.setPassword(results.getString("password"));
        user.setCreatedDate(results.getTimestamp("created_date"));
        user.setLastModifiedDate(results.getTimestamp("last_modified_date"));

        return user;
    }
}
