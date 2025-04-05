package com.example.JWeb.service;

import com.example.JWeb.model.Chitietdatve;
import com.example.JWeb.repository.IChitietdatveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChitietdatveService {

    @Autowired
    private IChitietdatveRepository iChitietdatveRepository;

    public void save(Chitietdatve chitietdatve) {
        iChitietdatveRepository.save(chitietdatve);
    }

    public void deletechitiet(String cccd,String marapchieu,String maphim,String ngayxem) {
        System.out.println("CCCD"+cccd);
        iChitietdatveRepository.deletechitiet(cccd,marapchieu,maphim,ngayxem);
    }

    public List<Chitietdatve> findchitiet(String cccd,String marapchieu,String maphim,String ngayxem) {
        List<Chitietdatve> chitiet = iChitietdatveRepository.findchitiet(cccd,marapchieu,maphim,ngayxem);
        return chitiet;
    }
}
