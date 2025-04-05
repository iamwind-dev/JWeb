package com.example.JWeb.repository;

import com.example.JWeb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    // Tìm user bằng username
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

}
