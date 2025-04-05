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
@Table(name="chitietdatve")
public class Chitietdatve {

    @Id
    @Column(name="cccd")
    private String cccd;

    @Column(name="marapchieu")
    private String marapchieu;

    @Column(name="maphim")
    private String maphim;

    @Column(name="ngayxem")
    private String ngayxem;

    @Column(name="suatchieu")
    private String suatchieu;

    @Column(name="sove")
    private String sove;

    @Column(name="vitrighe")
    private String vitrighe;

    @Column(name="thanhtien")
    private String thanhtien;
}
