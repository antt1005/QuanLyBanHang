package com.example.QuanLyBanHang.model;


import com.example.QuanLyBanHang.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users extends BaseEntity {

    private String userName;

    private String passWord;

    private String email;

    private String address;

    private String phoneNumber;

    private Integer status;

    @JsonManagedReference
    @ToString.Exclude
    @OneToMany(mappedBy = "user")
    private List<Cart> carts;  // Danh sách giỏ hàng của Userss

    public Users(String userName, String passWord, String email, String address, String phoneNumber, Integer status) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }
}
