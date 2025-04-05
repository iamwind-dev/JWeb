package com.example.JWeb.repository;

import com.example.JWeb.model.Chitietdatve;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IChitietdatveRepository extends CrudRepository<Chitietdatve, String> {
    @Query(value = "SELECT * FROM chitietdatve WHERE cccd LIKE '%' ?1 '%' and marapchieu LIKE '%' ?2 '%' and tenphim LIKE '%' ?3 '%' and ngayxem LIKE '%' ?4 '%' ", nativeQuery = true)
    public List<Chitietdatve> findchitiet(String cccd, String marapchieu, String maphim, String ngayxem);
    @Modifying
    @Transactional
    @Query(value="DELETE FROM chitietdatve WHERE cccd LIKE ?1 AND marapchieu LIKE ?2 AND maphim LIKE ?3 AND ngayxem LIKE ?4", nativeQuery = true)
    public void deletechitiet(String cccd, String marapchieu, String maphim, String ngayxem);


}
