package com.cn.uuu.pojo;

public class People {
	private Integer id ;
	private String username;
	private String password;
	private String email;
	private int age;
	private Address address;
	public Integer getId() {
		return id;
	}
	public People(Integer id, String username, String email,int age) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.age = age;
	}
	public People(Integer id, String username, String password, String email,
			int age, Address address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
		this.address = address;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", username=" + username + ", password="
				+ password + ", email=" + email + ", age=" + age + ", address="
				+ address + "]";
	}
	
		
}
