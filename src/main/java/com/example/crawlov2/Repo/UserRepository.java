package com.example.crawlov2.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crawlov2.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
