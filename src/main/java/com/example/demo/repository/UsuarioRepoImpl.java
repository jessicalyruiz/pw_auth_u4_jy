package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

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
