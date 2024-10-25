package com.example.QuanLyBanHang.service.impl;

import com.example.QuanLyBanHang.model.Product;
import com.example.QuanLyBanHang.model.Users;
import com.example.QuanLyBanHang.repository.ProductRepo;
import com.example.QuanLyBanHang.request.ProductSaveRequest;
import com.example.QuanLyBanHang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo repo;

    @Override
    public ProductSaveRequest create(ProductSaveRequest productsave) {
        Product product = new Product(productsave.getName(),productsave.getPrice(),
                productsave.getDescribe(),productsave.getQuantity(),productsave.getStatus());
       repo.save(product);
       return  productsave;
    }

    @Override
    public Product findid(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Product update(Integer id, ProductSaveRequest productupdate) {
        Product product = repo.findById(id).orElse(null);
        if(product !=null){
            product.setDescribe(productupdate.getDescribe());
            product.setPrice(productupdate.getPrice());
            product.setName(productupdate.getName());
            product.setQuantity(productupdate.getQuantity());
            product.setStatus(productupdate.getStatus());
          
            return repo.save(product);
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return repo.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        Product product = repo.findById(id).orElse(null);
        if(product != null){
            repo.delete(product);
            return true;
        }
        return false;
    }
}
