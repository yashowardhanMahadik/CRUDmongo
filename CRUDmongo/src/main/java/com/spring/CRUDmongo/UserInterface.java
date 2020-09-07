package com.spring.CRUDmongo;

import java.util.List;

public interface UserInterface {

	public List<User> getAll();
	
	public User create();
}
