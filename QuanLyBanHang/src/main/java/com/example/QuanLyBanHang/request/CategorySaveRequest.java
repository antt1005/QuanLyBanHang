package com.example.QuanLyBanHang.request;

import com.example.QuanLyBanHang.model.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class CategorySaveRequest {
    private String name;

    private String reviews;

    private String describe;

    private Integer timeCreated;

    private Integer timeUpdated;

    private Integer status;

}
