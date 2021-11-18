package com.dhbtecnologia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhbtecnologia.domain.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
