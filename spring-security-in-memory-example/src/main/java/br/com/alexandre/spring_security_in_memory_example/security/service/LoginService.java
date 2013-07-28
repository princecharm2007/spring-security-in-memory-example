package br.com.alexandre.spring_security_in_memory_example.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class LoginService implements UserDetailsService {

	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		return null;
	}
}
