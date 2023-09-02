package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.security.JwtUtils;
import com.example.demo.service.TO.UsuarioTO;

@RestController
@RequestMapping(path = "/tokens")
@CrossOrigin
public class TokenControllerRestfull {
	/*@Autowired
	IUsuarioService usuarioService;*/
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtils jwtUtils;
	
	@GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String construirToken(@RequestBody UsuarioTO usuarioTO) {
		//UsuarioTO user=this.usuarioService.buscarUsuario(usuarioTO.getUserName());
		System.out.println(usuarioTO.getUserName());
		System.out.println(usuarioTO.getSemilla());
		System.out.println(usuarioTO.getTiempo());
		this.authenticate(usuarioTO.getUserName(), usuarioTO.getPassword());
		
		return this.jwtUtils.generateJwtToken(usuarioTO.getUserName(),usuarioTO.getTiempo(),usuarioTO.getSemilla());
	}
	
	private void authenticate(String usuario, String password) {
		Authentication authentication =this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(usuario, password));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
	}

}
