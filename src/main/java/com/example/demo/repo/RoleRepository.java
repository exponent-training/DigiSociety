package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByRoleType(String roleType);
}
