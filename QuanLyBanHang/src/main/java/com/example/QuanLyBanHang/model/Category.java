package com.example.QuanLyBanHang.model;


import com.example.QuanLyBanHang.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Category")
@Data
@RequiredArgsConstructor
public class Category extends BaseEntity {


    private String name;

    private String reviews;

    private String describe;

    private Integer timeCreated;

    private Integer timeUpdated;

    private Integer status;

    @JsonBackReference
    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public Category(String name, String reviews, String describe, Integer timeCreated, Integer timeUpdated, Integer status) {
        this.name = name;
        this.reviews = reviews;
        this.describe = describe;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.status = status;
    }
}
