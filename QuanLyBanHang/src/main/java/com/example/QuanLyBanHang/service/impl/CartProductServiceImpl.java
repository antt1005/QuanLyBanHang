package com.example.QuanLyBanHang.service.impl;

import com.example.QuanLyBanHang.model.Cart;
import com.example.QuanLyBanHang.model.CartProduct;
import com.example.QuanLyBanHang.model.Product;
import com.example.QuanLyBanHang.repository.CartProductRepo;
import com.example.QuanLyBanHang.repository.CartRepo;
import com.example.QuanLyBanHang.repository.ProductRepo;
import com.example.QuanLyBanHang.request.CartProductSaveRequest;
import com.example.QuanLyBanHang.service.CartProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartProductServiceImpl implements CartProductService {

    @Autowired
    private CartProductRepo repo;

    @Autowired
    private CartRepo cartRepo;

    @Autowired
    private ProductRepo productRepo;

    @Override
    public CartProductSaveRequest create(CartProductSaveRequest cartProductsave) {
        Cart cart = cartRepo.getCartById(cartProductsave.getIdCart());
        Product product = productRepo.getProductById(cartProductsave.getIdProduct());

        CartProduct cartProduct = new CartProduct(cart,product,cartProductsave.getQuantity(),
                cartProductsave.getDiscount(), cartProductsave.getTotalMoney(),
                cartProductsave.getStatus());
        repo.save(cartProduct);
        return cartProductsave;
    }

    @Override
    public CartProduct findid(Integer id) {
        return repo.getCartProductById(id);
    }

    @Override
    public CartProduct update(Integer id, CartProductSaveRequest cartProductupdate) {
        CartProduct cartProduct = repo.findById(id).orElse(null);
        if(cartProduct != null){
            cartProduct.setDiscount(cartProductupdate.getDiscount());
            cartProduct.setQuantity(cartProductupdate.getQuantity());
            cartProduct.setStatus(cartProductupdate.getStatus());
            cartProduct.setTotalMoney(cartProductupdate.getTotalMoney());
            return repo.save(cartProduct);

        }
        return null;
    }

    @Override
    public List<CartProduct> getAll() {
        return repo.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        CartProduct cartProduct = repo.findById(id).orElse(null);
        if(cartProduct != null){
            repo.delete(cartProduct);
            return true;
        }else {
            return false;
        }

    }
}
