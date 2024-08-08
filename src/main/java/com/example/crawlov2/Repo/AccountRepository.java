package com.example.crawlov2.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crawlov2.Model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
