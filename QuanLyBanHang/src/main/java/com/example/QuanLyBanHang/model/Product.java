package com.example.QuanLyBanHang.model;

import com.example.QuanLyBanHang.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Product")
@Data
@RequiredArgsConstructor
public class Product extends BaseEntity {


    private String name;

    private Integer price;

    private String describe;

    private Integer quantity;

    private Integer status;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;

    public Product(String name, Integer price, String describe, Integer quantity, Integer status) {
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.quantity = quantity;
        this.status = status;
    }
}

