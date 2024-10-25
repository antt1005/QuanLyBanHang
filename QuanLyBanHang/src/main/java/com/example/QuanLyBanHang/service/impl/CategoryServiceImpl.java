package com.example.QuanLyBanHang.service.impl;

import com.example.QuanLyBanHang.model.Category;
import com.example.QuanLyBanHang.repository.CategoryRepo;
import com.example.QuanLyBanHang.request.CategorySaveRequest;
import com.example.QuanLyBanHang.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo repo;

    @Override
    public CategorySaveRequest create(CategorySaveRequest categorySave) {
        Category category = new Category(categorySave.getName(),categorySave.getReviews(),
                categorySave.getDescribe(), categorySave.getTimeCreated(),
                categorySave.getTimeUpdated(), categorySave.getStatus());
        repo.save(category);
        return categorySave;
    }

    @Override
    public Category findid(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Category update(Integer id, CategorySaveRequest categoryupdate) {
        Category category =repo.findById(id).orElse(null);
        if(category !=null){
            category.setName(categoryupdate.getName());
            category.setDescribe(categoryupdate.getDescribe());
            category.setReviews(categoryupdate.getReviews());
            category.setStatus(categoryupdate.getStatus());
            category.setTimeCreated(categoryupdate.getTimeCreated());
            category.setTimeUpdated(categoryupdate.getTimeUpdated());
          return repo.save(category);

        }
        return null;
    }

    @Override
    public List<Category> getAll() {
        return repo.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        Category category= repo.findById(id).orElse(null);
        if(category !=null){
            repo.delete(category);
            return true;
        }
        return false;
    }
}
