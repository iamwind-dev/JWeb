package com.example.JWeb.controller;

import com.example.JWeb.model.Chitietdatve;
import com.example.JWeb.model.Khachhang;
import com.example.JWeb.repository.IChitietdatveRepository;
import com.example.JWeb.repository.IKhachhangRepository;
import com.example.JWeb.service.ChitietdatveService;
import com.example.JWeb.service.KhachhangService;
import com.example.JWeb.service.PhimService;
import com.example.JWeb.service.RapchieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.util.Date;

@org.springframework.stereotype.Controller
@RequestMapping("/datphim")
public class Controller {

    @Autowired
    private ChitietdatveService chitietdatveService;
    @Autowired
    private KhachhangService khachhangService;
    @Autowired
    private RapchieuService rapchieuService;
    @Autowired
    private PhimService phimService;

    @RequestMapping("add")
    public String datphim(Model model) {
        model.addAttribute("khachhangModel", new Khachhang());
        model.addAttribute("chitietdatveModel", new Chitietdatve());
        model.addAttribute("raplist", rapchieuService.findAll());
        model.addAttribute("phimlist", phimService.findAll());
        return "formdatve";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute(name="khachhangModel") Khachhang khachhangModel,
                               @ModelAttribute(name="chitietdatveModel") Chitietdatve chitietdatveModel,Model model) {
        chitietdatveModel.setCccd(khachhangModel.getCccd());
        int thanhtien = Integer.decode(chitietdatveModel.getSove())*45000;
        String tien = Integer.toString(thanhtien);
        chitietdatveModel.setThanhtien(tien);
        khachhangService.save(khachhangModel);
        chitietdatveService.save(chitietdatveModel);
        return "formdatve";
    }


}
