package com.dhbtecnologia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhbtecnologia.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
