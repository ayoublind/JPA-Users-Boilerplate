package com.example.crawlov2.Model;

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
    public int account_id;
    public String Region;
    public String Default_website;
    public String Websites;
    public String Components;
    public boolean Sales;
    public boolean IsActive;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
