package com.example.JWeb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="phim")
public class Phim {
    @Id
    @Column(name="maphim")
    private String maphim;

    @Column(name="tenphim")
    private String tenphim;

    @Column(name="theloai")
    private String theloai;

    @Column(name="ngaybatdau")
    private String ngaybatdau;

    @Column(name="ngayketthuc")
    private String ngayketthuc;

    @Column(name="thoiluong")
    private String thoiluong;
}
