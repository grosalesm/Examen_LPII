package com.cibertec.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.app.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
