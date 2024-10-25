package com.example.QuanLyBanHang.request;

import lombok.Data;

@Data
public class CartProductSaveRequest {

    private Integer idCart;

    private Integer idProduct;

    private Integer quantity;

    private Integer discount;

    private Integer totalMoney;

    private Integer status;
}
