package com.example.QuanLyBanHang.controller;


import com.example.QuanLyBanHang.model.Category;
import com.example.QuanLyBanHang.request.CategorySaveRequest;
import com.example.QuanLyBanHang.service.CategoryService;
import com.example.QuanLyBanHang.validate.CategoryValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @Autowired
    private CategoryValidator validator;

    @GetMapping("/getAll")
    public List<Category> getAll(){
        return service.getAll();
    }
    @GetMapping("/find/{id}")
    public String findid(@PathVariable Integer id){
        Category category = service.findid(id);
        if(category !=null){
            return "tìm thành công"+category.toString();
        }else {
            return "k tìm thấy";
        }
    }

    @PostMapping("/create")
    public CategorySaveRequest create(@RequestBody CategorySaveRequest category){
         validator.validateCategorySaveRequest(category);
         return service.create(category);
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Integer id ,@RequestBody CategorySaveRequest category){
        Category categoryupdate = service.findid(id);
        if(categoryupdate !=null){
            validator.validateCategorySaveRequest(category);
            service.update(id,category);
            return "update thành công"+category.toString();
        }else {
            return "thất bại";
        }
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        boolean category = service.delete(id);
        if(category){
            return "xóa thành công";
        }else {
            return "xóa thất bại";
        }
    }




}
