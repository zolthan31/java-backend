package com.dhbtecnologia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhbtecnologia.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
