package com.br.app.web.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name= "estudantes")
public class Estudante {
	
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "nome", nullable = false)
  private String nome;
  
  @Column(name = "apelido", nullable = false)
  private String apelido;
  
  @Column(name = "email", nullable = false)
  private String email;
  
  
  public Estudante() {
	  
  }


public Estudante(Long id, String nome, String apelido, String email) {
	super();
	this.id = id;
	this.nome = nome;
	this.apelido = apelido;
	this.email = email;
}

public Estudante( String nome, String apelido, String email) {
	super();
	this.id = id;
	this.nome = nome;
	this.apelido = apelido;
	this.email = email;
}

public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getApelido() {
	return apelido;
}


public void setApelido(String apelido) {
	this.apelido = apelido;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


@Override
public String toString() {
	return "Estudante [id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", email=" + email + "]";
}
  
  
  
}
