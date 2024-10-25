package com.example.QuanLyBanHang.service;

import com.example.QuanLyBanHang.model.Users;
import com.example.QuanLyBanHang.request.UserSaveRequest;
import com.example.QuanLyBanHang.response.UserResponse;

import java.util.List;

public interface UserService {

    UserSaveRequest cread(UserSaveRequest user);
    Users findId(Integer id);
    List<Users> getAll();
    Users update(Integer id, UserSaveRequest user);
    boolean delete(Integer id);
}
