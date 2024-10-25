package com.example.QuanLyBanHang.service;

import com.example.QuanLyBanHang.model.Product;
import com.example.QuanLyBanHang.request.ProductSaveRequest;

import java.util.List;

public interface ProductService {
    ProductSaveRequest create(ProductSaveRequest product);
    Product findid(Integer id);
    Product update(Integer id,ProductSaveRequest product);
    List<Product> getAll();
    boolean delete(Integer id);

}
