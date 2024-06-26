package com.hermes.springbootmall.dao;

import com.hermes.springbootmall.constant.ProductCategory;
import com.hermes.springbootmall.dto.ProductQueryParams;
import com.hermes.springbootmall.dto.ProductRequest;
import com.hermes.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProduct(Integer productId);

}
