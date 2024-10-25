package com.example.QuanLyBanHang.controller;

import com.example.QuanLyBanHang.model.Cart;
import com.example.QuanLyBanHang.request.CartSaveRequest;
import com.example.QuanLyBanHang.service.CartService;
import com.example.QuanLyBanHang.validate.CartValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService service;

    @Autowired
    private CartValidator validator;

    @GetMapping("/getAll")
    public List<Cart> getAll(){
        return service.getAll();
    }

    @GetMapping("/find/{id}")
    public String findid(@PathVariable Integer id){
        Cart cart = service.findId(id);
        if(cart !=null){
            return "thành công"+cart.toString();
        }else {
            return "thất bại";
        }
    }
    @PostMapping("/create")
    public CartSaveRequest create(@RequestBody CartSaveRequest cart){
        validator.validateCartSaveRequest(cart);
        return service.create(cart);
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable Integer id,@RequestBody CartSaveRequest cart){
        Cart cartupdate = service.findId(id);
        if(cartupdate != null){
            validator.validateCartSaveRequest(cart);
            service.update(id,cart);
            return "update thành công"+cart.toString();
        }else {
            return "thất bại";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        boolean cart = service.delete(id);
        if(cart){
            return "xóa thành công";
        }else {
            return "xóa thất bại";
        }
    }

}
