package br.com.zallpy.technicalevaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zallpy.technicalevaluation.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

}
