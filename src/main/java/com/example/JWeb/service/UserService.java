package com.example.JWeb.service;

import com.example.JWeb.model.User;
import com.example.JWeb.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;


    public boolean login(String username, String rawPassword) {
        Optional<User> user = userRepository.findByUsername(username);

        // Kiểm tra username tồn tại và mật khẩu khớp
        if (user.isPresent()) {
            return rawPassword.equals(user.get().getPassword());
        }

        return false; // Username không tồn tại
    }

    public boolean signUp(String username, String password, String email) {
        // Kiểm tra xem tên đăng nhập đã tồn tại chưa
        if (userRepository.findByUsername(username).isPresent()) {
            return false; // Tên đăng nhập đã tồn tại
        }

        // Kiểm tra xem email đã tồn tại chưa
        if (userRepository.findByEmail(email).isPresent()) {
            return false; // Email đã tồn tại
        }

        // Tạo đối tượng User mới
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password); // Lưu mật khẩu thô, nhưng khuyến nghị mã hóa mật khẩu
        newUser.setEmail(email);

        // Lưu người dùng vào cơ sở dữ liệu
        userRepository.save(newUser);

        return true; // Đăng ký thành công
    }
}
