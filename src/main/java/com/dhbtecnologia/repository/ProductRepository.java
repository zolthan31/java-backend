package com.dhbtecnologia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhbtecnologia.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
