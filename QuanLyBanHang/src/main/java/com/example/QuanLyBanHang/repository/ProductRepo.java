package com.example.QuanLyBanHang.repository;


import com.example.QuanLyBanHang.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    Product getProductById(Integer id);
}
