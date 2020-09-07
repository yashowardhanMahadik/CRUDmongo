package com.spring.CRUDmongo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8102")
@RestController
public class RestRepository {

	
	private final UserMongoRepository userMongoRepository;
	
	public RestRepository(UserMongoRepository userMongoRepository) {
		// TODO Auto-generated constructor stub
		this.userMongoRepository = userMongoRepository;
	}
	
	@RequestMapping(value = "/heheh", method = RequestMethod.GET)
	public List<User> fetchAll()
	{
		return userMongoRepository.findAll();
	}
	
	@PostMapping(value="/add")
	public void addUser(@RequestBody User user)
	{
		userMongoRepository.save(user);
	}
	
}
