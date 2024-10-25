package com.example.QuanLyBanHang.repository;

import com.example.QuanLyBanHang.model.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartProductRepo extends JpaRepository<CartProduct,Integer> {
    CartProduct getCartProductById(Integer id);
}
