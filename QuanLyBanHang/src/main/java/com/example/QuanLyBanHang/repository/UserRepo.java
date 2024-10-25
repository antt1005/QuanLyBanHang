package com.example.QuanLyBanHang.repository;


import com.example.QuanLyBanHang.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {
    Users getUsersById(Integer id);
}
