package com.everyday.model;

public class UserDTO {
	
	private String id;
    private String password;
    private String email;
    private String nickname;
    private String enteranceyear;
    private String school;
    private String token;
    private int tokenexpiration;
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEntranceyear() {
		return enteranceyear;
	}
	public void setEntranceyear(String entranceyear) {
		this.enteranceyear = entranceyear;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public int getTokenexpiration() {
		return tokenexpiration;
	}
	public void setTokenexpiration(int tokenexpiration) {
		this.tokenexpiration = tokenexpiration;
	}
}
