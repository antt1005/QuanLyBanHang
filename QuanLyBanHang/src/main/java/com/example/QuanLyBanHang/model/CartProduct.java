package com.example.QuanLyBanHang.model;


import com.example.QuanLyBanHang.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "CartProduct")
@Data
@RequiredArgsConstructor
public class CartProduct extends BaseEntity {
    @JsonBackReference
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "idCart")
    private Cart cart;

    @JsonBackReference
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "idProduct")
    private Product product;

    private Integer quantity;

    private Integer discount;

    private Integer totalMoney;

    private Integer status;

    public CartProduct(Cart cart, Product product, Integer quantity, Integer discount, Integer totalMoney, Integer status) {
        this.cart = cart;
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
        this.totalMoney = totalMoney;
        this.status = status;
    }
}
