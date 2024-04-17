package com.hermes.springbootmall.service;

import com.hermes.springbootmall.dto.ProductRequest;
import com.hermes.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

}
