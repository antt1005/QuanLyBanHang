package com.example.QuanLyBanHang.service;

import com.example.QuanLyBanHang.model.Cart;
import com.example.QuanLyBanHang.request.CartSaveRequest;

import java.util.List;

public interface CartService {
    CartSaveRequest create (CartSaveRequest cart);
    Cart findId (Integer id);
    Cart update (Integer id ,CartSaveRequest cart);
    List<Cart> getAll();
    boolean delete(Integer id);
}
