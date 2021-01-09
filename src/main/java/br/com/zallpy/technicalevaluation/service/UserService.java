package br.com.zallpy.technicalevaluation.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zallpy.technicalevaluation.dto.UserDTO;
import br.com.zallpy.technicalevaluation.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<UserDTO> list() {
		return userRepository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
	}

}
