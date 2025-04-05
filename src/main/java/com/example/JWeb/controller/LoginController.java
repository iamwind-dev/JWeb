package com.example.JWeb.controller;

import com.example.JWeb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Tên file HTML (login.html)
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {
        boolean isAuthenticated = userService.login(username, password);
        if (isAuthenticated) {
            model.addAttribute("message", "Đăng nhập thành công!");

            return "redirect:/datphim/add"; // Điều hướng tới trang welcome.html
        } else {
            model.addAttribute("message", "Thông tin đăng nhập không hợp lệ!");
            return "login"; // Quay lại trang login.html
        }
    }
}

