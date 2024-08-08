package com.example.crawlov2.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crawlov2.Model.Access;
import com.example.crawlov2.Model.AccessDTO;
import com.example.crawlov2.Repo.AccessRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public List<AccessDTO> getAllAccessDTOs() {
        return accessRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private AccessDTO convertToDTO(Access access) {
        AccessDTO dto = new AccessDTO();
        dto.setId(access.getId());
        dto.setAccessType(access.getAccessType());
        if (access.getUser() != null) {
            dto.setUserName(access.getUser().getName());
            dto.setUserEmail(access.getUser().getEmail());
        }
        if (access.getAccount() != null) {
            dto.setAccountId(access.getAccount().getId());
            dto.setAccountRegion(access.getAccount().getRegion());
            dto.setAccountDefaultWebsite(access.getAccount().getDefault_website());
            dto.setAccountWebsites(access.getAccount().getWebsites());
            dto.setAccountComponents(access.getAccount().getComponents());
        }
        return dto;
    }
}
