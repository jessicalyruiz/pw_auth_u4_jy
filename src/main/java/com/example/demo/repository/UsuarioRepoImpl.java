package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Usuario;

@Repository
@Transactional
public class UsuarioRepoImpl implements IUsuarioRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Usuario consultarPorUserName(String userName) {
		// TODO Auto-generated method stub
		TypedQuery<Usuario> myQuery=this.entityManager.createQuery("Select u from Usuario u where u.userName=:valor", Usuario.class);
		myQuery.setParameter("valor", userName);
		return myQuery.getSingleResult();
	}
	

}
