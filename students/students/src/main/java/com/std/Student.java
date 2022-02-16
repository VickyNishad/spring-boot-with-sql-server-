package com.std;

public class Student {
	
	private int id;
	private String Name;
	private String Email;
	private String Address;
	public Student(int id, String name, String email, String address) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Address = address;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Address=" + Address + "]";
	}
	

}
