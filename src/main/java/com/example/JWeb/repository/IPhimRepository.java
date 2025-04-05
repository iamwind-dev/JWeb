package com.example.JWeb.repository;

import com.example.JWeb.model.Phim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhimRepository extends JpaRepository<Phim, String> {

}
