package com.tcs.VHAMW.model;

public class User implements Cloneable {
	private String userId;
	private String password;
	private String role;
	private String photo;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String password, String role, String photo) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.photo = photo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public boolean equals(Object obj) {
		User newu = (User) obj;
		
		
		/**
		 * 
		 * System.out.println("equals called " + newu.getPassword() + " "+newu.getPassword().equals(this.getPassword())+" " + newu.getPhoto() + " "+newu.getPhoto().equals(this.getPhoto())+" " + newu.getRole() + " "+newu.getRole().equals(this.getRole())+" "
				+ newu.getUserId() + " "+newu.getUserId().equals(this.getUserId())+" ");
		System.out.println("equals called " + this.getPassword() + " " + this.getPhoto() + " " + this.getRole() + " "
				+ this.getUserId() + "  ");
		
		System.out.println("ID "+newu.getUserId().equals(this.getUserId()));
		 * 
		 * 
		 */
		
		
		if (newu.getUserId().equals(this.getUserId())&&newu.getPassword().equals(this.getPassword()) && newu.getPhoto().equals(this.getPhoto())
				&& newu.getRole().equals(this.getRole()))
			return true;
		else
			return false;

	}

	public User clone() {
		User user = null;
		try {
			user = (User) super.clone();
		} catch (CloneNotSupportedException e) {
			// This should never happen
		}

		return user;

	}
}
