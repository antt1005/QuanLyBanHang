package com.example.QuanLyBanHang.service.impl;


import com.example.QuanLyBanHang.model.Cart;
import com.example.QuanLyBanHang.repository.CartRepo;
import com.example.QuanLyBanHang.request.CartSaveRequest;
import com.example.QuanLyBanHang.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepo repo;
    @Override
    public CartSaveRequest create(CartSaveRequest cartsave) {
        Cart cart = new Cart(cartsave.getName(),cartsave.getTimecreated(),
                cartsave.getNote(), cartsave.getStatus());
        repo.save(cart);
        return cartsave;
    }

    @Override
    public Cart findId(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Cart update(Integer id, CartSaveRequest cartupdate) {
        Cart cart = repo.findById(id).orElse(null);
        if(cart != null){
            cart.setName(cartupdate.getName());
            cart.setNote(cartupdate.getNote());
            cart.setStatus(cartupdate.getStatus());
            cart.setTimecreated(cartupdate.getTimecreated());
            return repo.save(cart);
        }
        return null;
    }

    @Override
    public List<Cart> getAll() {
        return repo.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        Cart cart = repo.findById(id).orElse(null);
        if(cart != null){
            repo.delete(cart);
            return true;
        }
        return false;
    }
}
