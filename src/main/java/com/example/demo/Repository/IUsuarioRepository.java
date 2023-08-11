package com.example.demo.Repository;

import com.example.demo.Repository.modelo.Usuario;

public interface IUsuarioRepository {

	
	public Usuario consultarPorUserName(String username);

}
