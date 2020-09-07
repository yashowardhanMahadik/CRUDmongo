package com.spring.CRUDmongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

	@Id
	private String id;
	

	private String firstName;
	private String email;
	
	

	private String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}
	private String getFirstName() {
		return firstName;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	
	
}
