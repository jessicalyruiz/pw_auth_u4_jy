package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IUsuarioRepository;
import com.example.demo.repository.modelo.Usuario;
import static java.util.Collections.emptyList;

@Service
public class UsuarioServiceImpl implements UserDetailsService{

	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario usuario=this.usuarioRepository.consultarPorUserName(username);
		
		return new User(usuario.getNameUser(), usuario.getPassword(), emptyList());
		
	
	}

}
