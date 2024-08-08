package com.example.crawlov2.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crawlov2.Model.Access;
import com.example.crawlov2.Repo.AccessRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AccessService {

    @Autowired
    private AccessRepository accessRepository;

    public List<Access> getAllAccesses() {
        return accessRepository.findAll();
    }

    public Optional<Access> getAccessById(Long id) {
        return accessRepository.findById(id);
    }

    public Access saveAccess(Access access) {
        return accessRepository.save(access);
    }

    public void deleteAccess(Long id) {
        accessRepository.deleteById(id);
    }
}
