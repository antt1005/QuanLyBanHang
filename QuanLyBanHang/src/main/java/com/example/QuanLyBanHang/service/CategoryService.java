package com.example.QuanLyBanHang.service;


import com.example.QuanLyBanHang.model.Category;
import com.example.QuanLyBanHang.request.CategorySaveRequest;

import java.util.List;

public interface CategoryService {
    CategorySaveRequest create (CategorySaveRequest category);
    Category findid (Integer id);
    Category update (Integer id,CategorySaveRequest category);
    List<Category> getAll();
    boolean delete(Integer id);

}
