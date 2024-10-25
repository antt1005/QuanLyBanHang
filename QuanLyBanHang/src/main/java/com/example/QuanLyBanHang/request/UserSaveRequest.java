package com.example.QuanLyBanHang.request;

import com.example.QuanLyBanHang.model.Cart;
import lombok.Data;

import java.util.List;

@Data
public class UserSaveRequest {

    private String userName;
    private String passWord;
    private String email;
    private String address;
    private String phoneNumber;
    private Integer status;

}
