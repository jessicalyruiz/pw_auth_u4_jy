package com.example.demo.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
