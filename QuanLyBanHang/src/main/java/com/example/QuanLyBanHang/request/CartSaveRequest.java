package com.example.QuanLyBanHang.request;

import com.example.QuanLyBanHang.model.Users;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class CartSaveRequest {
    private String name;

    private Integer timecreated;

    private String note;

    private Integer status;


}
