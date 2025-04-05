package com.example.JWeb.service;

import com.example.JWeb.model.Khachhang;
import com.example.JWeb.repository.IKhachhangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhachhangService {

    @Autowired
    private IKhachhangRepository iKhachhangRepository;

    public void save(Khachhang khachhang) {
        iKhachhangRepository.save(khachhang);
    }
}
