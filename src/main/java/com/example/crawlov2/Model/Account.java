package com.example.crawlov2.Model;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String Region;
    public String Default_website;
    public String Websites;
    public String Components;
    
    @OneToMany(mappedBy = "account")
    private List<Access> accesses;
}
