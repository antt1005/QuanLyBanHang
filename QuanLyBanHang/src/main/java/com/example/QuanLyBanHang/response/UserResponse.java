package com.example.QuanLyBanHang.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponse {
    private String userName;
    private String passWord;
    private String email;
    private String address;
    private String phoneNumber;
    private Integer status;
//    private String carts;
}
