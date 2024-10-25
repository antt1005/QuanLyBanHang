package com.example.QuanLyBanHang.service;

import com.example.QuanLyBanHang.model.CartProduct;
import com.example.QuanLyBanHang.request.CartProductSaveRequest;

import java.util.List;

public interface CartProductService {
    CartProductSaveRequest create(CartProductSaveRequest cartProduct);
    CartProduct findid(Integer id);
    CartProduct update(Integer id,CartProductSaveRequest cartProduct);
    List<CartProduct> getAll();
    boolean delete(Integer id);
}
