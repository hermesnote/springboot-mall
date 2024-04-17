package com.hermes.springbootmall.service;

import com.hermes.springbootmall.constant.ProductCategory;
import com.hermes.springbootmall.dto.ProductRequest;
import com.hermes.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);


}
