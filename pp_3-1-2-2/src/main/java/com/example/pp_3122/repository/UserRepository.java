package com.example.pp_3122.repository;

import com.example.pp_3122.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
