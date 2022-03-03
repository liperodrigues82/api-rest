package com.revisao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revisao.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
