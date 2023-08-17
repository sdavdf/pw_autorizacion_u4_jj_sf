package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IUsuarioService;
import com.example.demo.service.to.UsuarioTo;


@RestController
@RequestMapping("/tokens")
@CrossOrigin
public class TokenControllerRestFul {
	
	private IUsuarioService iUsuarioService;
	
	@GetMapping("/obtener")
	public String ObtenerToken(@PathVariable UsuarioTo usuario) {
		// String cedula = "1750844787";
		return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
	}
}
