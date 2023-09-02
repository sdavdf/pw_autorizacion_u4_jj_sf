package com.example.demo.Repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "token")
public class Token {
	
	@Id
	@Column(name = "toke_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "toke_id_seq")
	@SequenceGenerator(name = "toke_id_seq", sequenceName = "toke_id_seq", allocationSize = 1)
	private Integer id;
	@Column(name = "toke_token")
	private String token;
	@Column(name = "toke_semilla")
	private String semilla;
	@Column(name = "toke_tiempo")
	private String tiempo;
	
	
	//SET Y GET
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getSemilla() {
		return semilla;
	}

	public void setSemilla(String semilla) {
		this.semilla = semilla;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	
	
}
