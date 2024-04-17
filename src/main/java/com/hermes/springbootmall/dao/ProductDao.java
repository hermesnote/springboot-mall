package com.hermes.springbootmall.dao;

import com.hermes.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

}
