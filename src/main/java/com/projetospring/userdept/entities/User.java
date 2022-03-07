package com.projetospring.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity //diz que vai ser uma entidade do banco de dados
@Table(name = "tb_user")// nome da tabela que eu quero
public class User {

	@Id //diz que vai ser um Id unico
	@GeneratedValue(strategy = GenerationType.IDENTITY) // gera o valor de forma automatica
	private Long id;
	private String name;
	private String email;
	
	@ManyToOne // faz o relacionamento dizendo que vai ser muitos para um
	@JoinColumn(name = "department_id") // diz qual é a coluna que vai ser FK
	private Department department;

	public User() {
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}