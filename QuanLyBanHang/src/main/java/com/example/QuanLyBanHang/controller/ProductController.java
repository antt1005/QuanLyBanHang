package com.example.QuanLyBanHang.controller;


import com.example.QuanLyBanHang.model.Product;
import com.example.QuanLyBanHang.request.ProductSaveRequest;
import com.example.QuanLyBanHang.service.ProductService;
import com.example.QuanLyBanHang.validate.ProductValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService service;

    @Autowired
    private ProductValidator productValidator;

    @GetMapping("/getAll")
    public List<Product> getAll(){
        return service.getAll();
    }

    @GetMapping("/find/{id}")
    public String findid(@PathVariable Integer id){
        Product product = service.findid(id);
        if(product != null){
            return "thanh cong"+product.toString();
        }else {
            return "that bai";
        }
    }
    @PostMapping("/create")
    public ProductSaveRequest create(@RequestBody ProductSaveRequest product){
        productValidator.validateProductSaveRequest(product);
        return  service.create(product);
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable Integer id,@RequestBody ProductSaveRequest product){
        Product productupdate = service.findid(id);
        if(productupdate != null){
            productValidator.validateProductSaveRequest(product);
            service.update(id,product);
            return "update thành công"+product.toString();
        }else {
            return "thất bại";
        }
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        boolean product = service.delete(id);
        if(product){
            return "xóa thành công";
        }else {
            return "thất bại";
        }
    }


}
