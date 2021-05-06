package com.springmvc.pojo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.springmvc.validation.Key;

public class User {

	@Length(min = 3, max = 15, message = "First Name should be between 3 to 15 characters")
	private String firstName;
	
	private String lastName;
	
	@Email
	private String email;
	
	@Size(min = 3, max = 15, message = "Last Name should be between 3 to 15 characters")
	private String password;
	
	@NotEmpty(message = "Please insert password again")
	private String confirmPassword;
	
	@Key
	private String key;
	
	private String gender;
	
	private String[] language;
	
	private String education;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEducation() {
		return education;
	}

	public String[] getLanguage() {
		return language;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public void setLanguage(String[] language) {
		this.language = language;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getKey() {
		return key;
	}

}
