package edu.just.model;

public class User {
    private String user;
    private String password;
    private String id;
    private String authority;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
 
	public String getAuthority() {
		return authority;
	}
	@Override
	public String toString() {
		return "User [user=" + user + ", password=" + password + ", id=" + id
				+ ", authority=" + authority + "]";
	}
 
    
}
