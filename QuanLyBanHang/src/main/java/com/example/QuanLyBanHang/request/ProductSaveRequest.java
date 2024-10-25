package com.example.QuanLyBanHang.request;

import lombok.Data;

@Data
public class ProductSaveRequest {

    private String name;

    private Integer price;

    private String describe;

    private Integer quantity;

    private Integer status;

}
