package com.example.QuanLyBanHang.controller;

import com.example.QuanLyBanHang.model.CartProduct;
import com.example.QuanLyBanHang.request.CartProductSaveRequest;
import com.example.QuanLyBanHang.service.CartProductService;
import com.example.QuanLyBanHang.validate.CartProductValidator;
import com.example.QuanLyBanHang.validate.CartValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartProduct")
public class CartProductcontroller {
    @Autowired
    private CartProductService service;

    @Autowired
    private CartProductValidator validator;

    @GetMapping("/getAll")
    public List<CartProduct> getAll() {
        return service.getAll();
    }

    @GetMapping("/find/{id}")
    public String findid(@PathVariable Integer id) {
        CartProduct cartProduct = service.findid(id);
        if (cartProduct != null) {
            return "tìm thấy " + cartProduct.toString();
        } else {
            return "k thấy";
        }
    }

    @PostMapping("/create")
    public CartProductSaveRequest create(@RequestBody CartProductSaveRequest cartProduct) {
        validator.validateCartProductSaveRequest(cartProduct);
        return service.create(cartProduct);
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Integer id, @RequestBody CartProductSaveRequest cartProduct) {
        CartProduct cartProductupdate = service.findid(id);
        if (cartProductupdate != null) {
            validator.validateCartProductSaveRequest(cartProduct);
            service.update(id, cartProduct);
            return "update thành công " + cartProduct.toString();
        } else {
            return "update thất bại ";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        boolean cartProduct = service.delete(id);
        if (cartProduct) {
            return "xóa thành công";
        } else {
            return "xóa thất bại";
        }
    }

}
