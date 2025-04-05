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
@Table(name="khachhang")
public class Khachhang {
    @Id
    @Column(name="cccd")
    private String cccd;

    @Column(name="hoten")
    private String hoten;

    @Column(name="sdt")
    private String sdt;

    @Column(name="email")
    private String email;
}
