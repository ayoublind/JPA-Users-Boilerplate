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

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getDefault_website() {
		return Default_website;
	}

	public void setDefault_website(String default_website) {
		Default_website = default_website;
	}

	public String getWebsites() {
		return Websites;
	}

	public void setWebsites(String websites) {
		Websites = websites;
	}

	public String getComponents() {
		return Components;
	}

	public void setComponents(String components) {
		Components = components;
	}

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
