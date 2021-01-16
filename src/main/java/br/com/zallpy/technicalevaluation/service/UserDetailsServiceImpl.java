package br.com.zallpy.technicalevaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.zallpy.technicalevaluation.model.User;
import br.com.zallpy.technicalevaluation.repository.UserRepository;
import br.com.zallpy.technicalevaluation.security.AuthenticatedUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException(email);
        }
        return new AuthenticatedUser(user.getId(), user.getEmail(), user.getPassword());
    }

}
