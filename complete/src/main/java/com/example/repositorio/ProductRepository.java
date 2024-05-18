package com.example.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Producto;
 
public interface ProductRepository extends JpaRepository<Producto, Integer> {
 
}