package com.example.JWeb.controller;

import com.example.JWeb.service.ChitietdatveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/chitiet")
public class SearchController {
    @Autowired
    private ChitietdatveService chitietdatveService;
    @RequestMapping("/search")
    public String search(@RequestParam(defaultValue = "",name ="cccd") String cccd,
                         @RequestParam(defaultValue = "",name ="marapchieu") String marapchieu,
                         @RequestParam(defaultValue = "",name ="maphim") String maphim,
                         @RequestParam(defaultValue = "",name ="ngayxem") String ngayxem, Model model) {
        model.addAttribute("listchitiet",chitietdatveService.findchitiet(cccd,marapchieu,maphim,ngayxem));
        return "search";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(defaultValue = "",name ="cccd") String cccd,
                         @RequestParam(defaultValue = "",name ="marapchieu") String marapchieu,
                         @RequestParam(defaultValue = "",name ="maphim") String maphim,
                         @RequestParam(defaultValue = "",name ="ngayxem") String ngayxem, Model model) {

        chitietdatveService.deletechitiet(cccd,marapchieu,maphim,ngayxem);
        model.addAttribute("listchitiet",chitietdatveService.findchitiet("","","",""));
        return "search";
    }
}
