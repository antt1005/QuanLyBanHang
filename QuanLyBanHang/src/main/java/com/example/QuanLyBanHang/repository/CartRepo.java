package com.example.QuanLyBanHang.repository;

import com.example.QuanLyBanHang.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends JpaRepository<Cart,Integer> {
      Cart getCartById(Integer id);
}
