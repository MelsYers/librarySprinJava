package com.iitu.library.repository;

import com.iitu.library.entity.User;
import com.iitu.library.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<UserRole, Long> {
}
