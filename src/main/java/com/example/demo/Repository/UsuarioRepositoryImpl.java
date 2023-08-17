package com.example.demo.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.Repository.modelo.Usuario;



@Repository
@Transactional
public class UsuarioRepositoryImpl implements IUsuarioRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Usuario consultarPorUserName(String username) {

		TypedQuery<Usuario> myQuery = this.entityManager
				.createQuery("SELECT u FROM Usuario u WHERE u.username=: datoUsername", Usuario.class);
		myQuery.setParameter("datoUsername", username);
		return myQuery.getSingleResult();
	}

	
	
}
