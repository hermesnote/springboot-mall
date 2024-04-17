package com.hermes.springbootmall.dao;

import com.hermes.springbootmall.dto.ProductRequest;
import com.hermes.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

}
