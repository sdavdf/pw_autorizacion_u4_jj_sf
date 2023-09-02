package com.example.demo.Repository;

import com.example.demo.Repository.modelo.Usuario;

import com.example.demo.Repository.modelo.*;

public interface IUsuarioRepository {

	
	public Usuario consultarPorUserName(String username);
	
	public Token consultar(Integer id);
	

}
