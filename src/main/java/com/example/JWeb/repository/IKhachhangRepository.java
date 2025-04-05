package com.example.JWeb.repository;

import com.example.JWeb.model.Khachhang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKhachhangRepository extends JpaRepository<Khachhang, String> {

}
