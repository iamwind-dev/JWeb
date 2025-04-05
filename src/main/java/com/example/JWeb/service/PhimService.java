package com.example.JWeb.service;

import com.example.JWeb.model.Phim;
import com.example.JWeb.model.Rapchieu;
import com.example.JWeb.repository.IPhimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhimService {

    @Autowired
    private IPhimRepository iPhimRepository;

    public List<Phim> findAll() {
        List<Phim> phimList = iPhimRepository.findAll();
        return phimList;
    }
}
