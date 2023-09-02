package com.example.demo.service;

import com.example.demo.Repository.modelo.Usuario;

public interface IUsuarioService {
	
	public Usuario consultarPorUserName(String username);

}
