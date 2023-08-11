package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.service.TO.UsuarioTO;

@RestController
@RequestMapping(path = "tokens")
@CrossOrigin
public class TokenControllerRestfull {
	/*@Autowired
	IUsuarioService usuarioService;*/
	
	
	@GetMapping
	public String construirToken(@RequestBody UsuarioTO usuarioTO) {
		//UsuarioTO user=this.usuarioService.buscarUsuario(usuarioTO.getUserName());
		return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
	}

}
