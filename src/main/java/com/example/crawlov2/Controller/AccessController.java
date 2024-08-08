package com.example.crawlov2.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.crawlov2.Model.Access;
import com.example.crawlov2.Service.AccessService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/accesses")
public class AccessController {

    @Autowired
    private AccessService accessService;

    @GetMapping
    public List<Access> getAllAccesses() {
        return accessService.getAllAccesses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Access> getAccessById(@PathVariable Long id) {
        Optional<Access> access = accessService.getAccessById(id);
        return access.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Access createAccess(@RequestBody Access access) {
        return accessService.saveAccess(access);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccess(@PathVariable Long id) {
        accessService.deleteAccess(id);
        return ResponseEntity.noContent().build();
    }
}
