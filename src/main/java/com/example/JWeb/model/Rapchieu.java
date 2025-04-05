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
@Table(name="rapchieu")
public class Rapchieu {
    @Id
    @Column(name="marapchieu")
    private String marapchieu;

    @Column(name="diachi")
    private String diachi;

    @Column(name="sdt")
    private String sdt;

    @Column(name="tennguoiphutrach")
    private String tennguoiphutrach;
}
