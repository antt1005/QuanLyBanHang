package com.example.QuanLyBanHang.repository;


import com.example.QuanLyBanHang.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
