package com.devops.devopsjavaapp.repository;

import com.devops.devopsjavaapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Spring Data JPA автоматически создаст все нужные методы!
    // findAll(), findById(), save(), delete() и т.д.
}