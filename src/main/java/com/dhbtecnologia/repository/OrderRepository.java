package com.dhbtecnologia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhbtecnologia.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
