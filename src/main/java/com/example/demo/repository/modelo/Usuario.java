package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@Column(name = "usua_id")
	@SequenceGenerator(allocationSize = 1,name = "seq_usuario", sequenceName = "seq_usuario")
	@GeneratedValue(generator = "seq_usuario", strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name = "usua_name_user")
	private String nameUser;
	
	
	@Column(name = "usua_password")
	private String password;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNameUser() {
		return nameUser;
	}


	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
