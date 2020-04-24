package com.iitu.library.repository;

import com.iitu.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByUsernameContainsAndEmailContains(String username, String email);

    User findByUsername(String username);
}
