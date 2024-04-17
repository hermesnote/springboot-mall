package com.hermes.springbootmall.rowmapper;

import com.hermes.springbootmall.constant.ProductCategory;
import com.hermes.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {

        Product product = new Product();

        product.setProductId(resultSet.getInt("product_id"));
        product.setProductName(resultSet.getString("product_name"));

        // 使用 String 轉 Enum
        String categoryStr = resultSet.getString("category");
        ProductCategory category = ProductCategory.valueOf(categoryStr);
        product.setCategory(category);

        // 上面一行解決
//        product.setCategory(ProductCategory.valueOf(resultSet.getString("category")));

        // 未 Enum 的原程式
//        product.setCategory(resultSet.getString("category"));

        product.setImageUrl(resultSet.getString("image_url"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock(resultSet.getInt("stock"));
        product.setDescription(resultSet.getString("description"));
        product.setCreatedDate(resultSet.getTimestamp("created_date"));
        product.setLastModifiedDate(resultSet.getTimestamp("last_modified_date"));

        return product;
    }
}
