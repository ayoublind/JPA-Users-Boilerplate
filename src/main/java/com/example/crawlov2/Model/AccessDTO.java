package com.example.crawlov2.Model;

public class AccessDTO {

    private Long id;
    private String accessType;
    private String userName;
    private String userEmail;
    private Long accountId;
    private String accountRegion;
    private String accountWebsites;
    private String accountDefaultWebsite;
    private String accountComponents;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccessType() {
		return accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getAccountRegion() {
		return accountRegion;
	}
	public void setAccountRegion(String accountRegion) {
		this.accountRegion = accountRegion;
	}
	public String getAccountWebsites() {
		return accountWebsites;
	}
	public void setAccountWebsites(String accountWebsites) {
		this.accountWebsites = accountWebsites;
	}
	public String getAccountDefaultWebsite() {
		return accountDefaultWebsite;
	}
	public void setAccountDefaultWebsite(String accountDefaultWebsite) {
		this.accountDefaultWebsite = accountDefaultWebsite;
	}
	public String getAccountComponents() {
		return accountComponents;
	}
	public void setAccountComponents(String accountComponents) {
		this.accountComponents = accountComponents;
	}
}
