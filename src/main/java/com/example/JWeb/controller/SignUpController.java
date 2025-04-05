package com.example.JWeb.controller;

import com.example.JWeb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class SignUpController {

    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String showSignUpForm() {
        return "signup"; // Trả về view signup.html
    }

    @PostMapping("/signup")
    public String signUp(@RequestParam String username,
                         @RequestParam String password,
                         @RequestParam String email,
                         Model model) {
        boolean isRegistered = userService.signUp(username, password, email);
        if (isRegistered) {
            model.addAttribute("message", "Đăng ký thành công!");
            return "login"; // Chuyển tới trang đăng nhập sau khi đăng ký thành công
        } else {
            model.addAttribute("message", "Tên đăng nhập hoặc email đã tồn tại!");
            return "signup"; // Quay lại trang đăng ký nếu có lỗi
        }
    }
}
