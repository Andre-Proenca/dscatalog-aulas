package com.softcraft.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softcraft.dscatalog.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
