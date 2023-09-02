package com.example.demo.service.TO;

import java.io.Serializable;

public class UsuarioTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	private Integer id;
	private String userName;
	private String password;
	
	
	private Integer tiempo;
	
	private String semilla;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getTiempo() {
		return tiempo;
	}
	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}
	public String getSemilla() {
		return semilla;
	}
	public void setSemilla(String semilla) {
		this.semilla = semilla;
	}
	
	
	
}
