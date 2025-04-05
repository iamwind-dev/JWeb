package com.example.JWeb.repository;

import com.example.JWeb.model.Rapchieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRapchieuRepository extends JpaRepository<Rapchieu, String> {

}
