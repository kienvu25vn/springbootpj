package com.springbuoi5.repository;

import com.springbuoi5.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUsernameContains(String username);
}
