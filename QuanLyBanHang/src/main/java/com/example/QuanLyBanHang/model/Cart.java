package com.example.QuanLyBanHang.model;

import com.example.QuanLyBanHang.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Cart")
@Data
@RequiredArgsConstructor
public class Cart extends BaseEntity {

    private String name;

    private Integer timecreated;

    private String note;

    private Integer status;
    @JsonManagedReference
    @ManyToOne()
    @JoinColumn(name = "idUser")
    private Users user;

    public Cart(String name, Integer timecreated, String note, Integer status) {
        this.name = name;
        this.timecreated = timecreated;
        this.note = note;
        this.status = status;
    }
}
