package com.pat.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.pat.project.entity.User;
import com.pat.project.service.IUserService;
import com.pat.project.service.PatriotURIConstant;

@Controller
@RequestMapping(PatriotURIConstant.PATRIOT)
public class UserController {
	private static final String ID = "id";
	@Autowired
	private IUserService userService;

	/*@GetMapping("/")
	public String welcome() {
		return "home";
	}*/
	
	
	@GetMapping(PatriotURIConstant.USER_ID)
	public ResponseEntity<User> getUsereById(@PathVariable(ID) String id) {
		User user = userService.getUserById(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	@GetMapping(PatriotURIConstant.USER_ID_DASHBOARD)
	public ResponseEntity<User> userDashboardById(@PathVariable(ID) String id) {
		User user = userService.userDashboardById(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@GetMapping(PatriotURIConstant.USERS)
	public ResponseEntity<List<User>> getAllUsers() {
		System.out.println("GetMapping");
		List<User> listOfUsers = userService.getAllUsers();
		return new ResponseEntity<List<User>>(listOfUsers, HttpStatus.OK);
	}

	@PostMapping(PatriotURIConstant.ADD_USER)
	public ResponseEntity<Void> addUser(@RequestBody User user, UriComponentsBuilder builder) {
		boolean flag = userService.addUser(user);
		if (flag == false) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path(PatriotURIConstant.ARTICLE_ID).buildAndExpand(user.getUserId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@PutMapping(PatriotURIConstant.UPDATE_ARTICLE)
	public ResponseEntity<User> updateArticle(@RequestBody User user) {
		userService.updateUser(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@DeleteMapping(PatriotURIConstant.ARTICLE_ID)
	public ResponseEntity<Void> deleteArticle(@PathVariable(ID) String id) {
		userService.deleteUser(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}