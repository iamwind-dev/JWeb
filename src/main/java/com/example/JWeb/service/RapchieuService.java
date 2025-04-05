package com.example.JWeb.service;

import com.example.JWeb.model.Rapchieu;
import com.example.JWeb.repository.IRapchieuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RapchieuService {
    @Autowired
    private IRapchieuRepository iRapchieuRepository;

    public List<Rapchieu> findAll() {
        List<Rapchieu> rapList = iRapchieuRepository.findAll();
        return rapList;
    }
}
