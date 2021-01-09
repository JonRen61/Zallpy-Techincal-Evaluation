package br.com.zallpy.technicalevaluation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zallpy.technicalevaluation.dto.UserDTO;
import br.com.zallpy.technicalevaluation.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/list")
	public List<UserDTO> listUsers() {
		return userService.list();
	}

}
